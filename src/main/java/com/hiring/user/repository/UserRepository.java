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
	
	@Query("SELECT new com.hiring.user.dto.UserExperienceAndEducationDTO(" +
	        "u.firstName, u.lastName, u.email, u.mobileNumber, ex.company, ex.position, " +
	        "1, edu.degree, edu.major, edu.graduationDate) " +
	        "FROM User u " +
	        "INNER JOIN UserExperience ex ON u.userId = ex.user.userId " +
	        "INNER JOIN UserEducation edu ON ex.user.userId = edu.user.userId")
	List<UserExperienceAndEducationDTO> getUsersCompleteInfo();


}
