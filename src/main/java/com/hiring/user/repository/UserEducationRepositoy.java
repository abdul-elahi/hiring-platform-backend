package com.hiring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiring.user.UserEducation;

@Repository
public interface UserEducationRepositoy extends JpaRepository<UserEducation, Long> {

}
