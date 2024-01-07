package com.hiring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiring.user.UserResume;

public interface UserResumeRepositiry extends JpaRepository<UserResume, Long> {

	boolean existsByUserUserId(Long userId);

	UserResume getByUserUserId(Long userId);

}
