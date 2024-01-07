package com.hiring.job.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiring.job.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
