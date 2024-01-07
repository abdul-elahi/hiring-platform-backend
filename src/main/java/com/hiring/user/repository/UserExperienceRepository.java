package com.hiring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiring.user.UserExperience;

@Repository
public interface UserExperienceRepository extends JpaRepository<UserExperience, Long> {

}
