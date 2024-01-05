package com.hiring.experience.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiring.experience.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}
