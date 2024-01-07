package com.hiring.user.service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hiring.commons.Document;
import com.hiring.exception.ApplicationException;
import com.hiring.user.User;
import com.hiring.user.UserResume;
import com.hiring.user.dto.UserExperienceAndEducationDTO;
import com.hiring.user.dto.UserRegisterDTO;
import com.hiring.user.repository.UserEducationRepositoy;
import com.hiring.user.repository.UserExperienceRepository;
import com.hiring.user.repository.UserRepository;
import com.hiring.user.repository.UserResumeRepositiry;
import com.hiring.utils.SaveFilesToLocation;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserExperienceRepository experienceRepository;

	@Autowired
	UserEducationRepositoy educationRepositoy;

	@Autowired
	UserResumeRepositiry userResumeRepositiry;

	@Autowired
	SaveFilesToLocation saveFilesToLocation;

	@Override
	public Document<?> getAllUsersData() {
		Document<List<User>> result = new Document<>();
		try {
			List<User> users = userRepository.findAll();
			if (users.isEmpty())
				throw new ApplicationException("No users found.");

			System.out.println(users);
			result.setData(users);
			result.setMessage(users.size() + " records found.");
			result.setStatusCode(HttpStatus.OK.value());
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			result.setData(null);
			result.setMessage(e.getMessage());
			result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return result;
	}

	@Override
	public Document<?> findByUserId(Long id) {
		Document<User> result = new Document<>();
		try {
			User users = userRepository.findByUserId(id);
			if (users == null)
				throw new ApplicationException("No users found.");

			result.setData(users);
			result.setMessage(" records found.");
			result.setStatusCode(HttpStatus.OK.value());
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			result.setData(null);
			result.setMessage(e.getMessage());
			result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return result;
	}

	@Override
	public Document<?> saveNewUser(UserRegisterDTO userRegisterDTO) {
		Document<User> result = new Document<>();
		try {
			System.out.println("Saving user ");
			String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			String mobileRegex = "^[6-9]\\d{9}$";

			Boolean existFalg = userRepository.existsByMobileNumberOrEmail(userRegisterDTO.getMobileNumber(),
					userRegisterDTO.getEmail());
			if (existFalg)
				throw new ApplicationException("User already exists");
			if (!userRegisterDTO.getEmail().matches(emailRegex))
				throw new ApplicationException("Invalid Email Format.");
			if (!userRegisterDTO.getMobileNumber().matches(mobileRegex))
				throw new ApplicationException("Invalid Mobile Number");

			User user = new User(userRegisterDTO.getFirstName(), userRegisterDTO.getLastName(),
					userRegisterDTO.getPassword(), userRegisterDTO.getEmail(), userRegisterDTO.getMobileNumber(),
					userRegisterDTO.getRole(), Instant.now());

			User saveUser = userRepository.save(user);

			result.setData(saveUser);
			result.setMessage("User Saved successfully");
			result.setStatusCode(HttpStatus.OK.value());

		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			result.setData(null);
			result.setMessage(e.getMessage());
			result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return result;
	}

	@Override
	public Document<?> getUsersDataCompletely() {
		Document<List<UserExperienceAndEducationDTO>> result = new Document<>();
		try {
			List<UserExperienceAndEducationDTO> users = userRepository.getUsersCompleteInfo();
			if (users.isEmpty())
				throw new ApplicationException("No users found.");

			System.out.println(users);
			result.setData(users);
			result.setMessage(users.size() + " records found.");
			result.setStatusCode(HttpStatus.OK.value());
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			result.setData(null);
			result.setMessage(e.getMessage());
			result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return result;
	}

	@Override
	public Document<?> uploadResumeForUser(MultipartFile userResume, Long userId) {
		Document<String> result = new Document<>();
		try {

			if (userResume.isEmpty())
				throw new ApplicationException("please upoad resume");

			String resumePath = saveFilesToLocation.storeResume(userResume, userId);

			UserResume resume = new UserResume(userId, userId+"_"+LocalDate.now() + "_" + userResume.getOriginalFilename(),
					resumePath, Instant.now());
			userResumeRepositiry.save(resume);
			LOGGER.info("Resume Uploaded to " + resumePath);

			result.setData(userResume.getOriginalFilename());
			result.setMessage(" uploaded successfully");
			result.setStatusCode(HttpStatus.OK.value());
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			result.setData(null);
			result.setMessage(e.getMessage());
			result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return result;
	}

}
