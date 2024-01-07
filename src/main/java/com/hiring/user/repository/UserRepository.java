package com.hiring.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hiring.user.User;
import com.hiring.user.dto.UserExperienceAndEducationDTO;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long id);

	Boolean existsByMobileNumberOrEmail(String mobileNumber, String email);

	@Query("SELECT new com.hiring.user.dto.UserExperienceAndEducationDTO("
			+ "u.firstName, u.lastName, u.email, u.mobileNumber, ex.company,ex.startDate,ex.endDate, ex.position, "
			+ "ex.experience, edu.degree,edu.institution, edu.major, edu.graduationDate,r.fileLocation) "
			+ "FROM User u "
			+ "OUTER JOIN UserExperience ex ON u.userId = ex.user.userId "
			+ "JOIN UserEducation edu ON ex.user.userId = edu.user.userId "
			+ "OUTER JOIN UserResume r ON ex.user.userId = r.user.userId")
	List<UserExperienceAndEducationDTO> getUsersCompleteInfo();

}
