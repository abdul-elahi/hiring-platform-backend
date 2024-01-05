package com.hiring.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiring.education.Education;

@Repository
public interface EducationRepositoy extends JpaRepository<Education, Long> {

}
