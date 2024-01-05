package com.hiring.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hiring.commons.Document;
import com.hiring.education.repository.EducationRepositoy;
import com.hiring.exception.ApplicationException;
import com.hiring.experience.repository.ExperienceRepository;
import com.hiring.user.User;
import com.hiring.user.UserExperienceAndEducationDTO;
import com.hiring.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	ExperienceRepository experienceRepository;

	@Autowired
	EducationRepositoy educationRepositoy;

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
	public Document<?> saveNewUser(User user) {
		Document<User> result = new Document<>();
		try {
			String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			String mobileRegex = "^[6-9]\\d{9}$";

			Boolean existFalg = userRepository.existsByMobileNumberOrEmail(user.getMobileNumber(), user.getEmail());
			if (existFalg)
				throw new ApplicationException("User already exists");

			if (!user.getEmail().matches(emailRegex))
				throw new ApplicationException("Invalid Email Format.");
			if (!user.getMobileNumber().matches(mobileRegex))
				throw new ApplicationException("Invalid Mobile Number");

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

}
