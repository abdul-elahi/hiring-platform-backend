package com.hiring.jobapplication;

import java.time.Instant;

import com.hiring.job.Job;
import com.hiring.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String resumeUrl;

    private String applicationStatus;

    private Instant applicationDate;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getResumeUrl() {
		return resumeUrl;
	}

	public void setResumeUrl(String resumeUrl) {
		this.resumeUrl = resumeUrl;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Instant getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Instant applicationDate) {
		this.applicationDate = applicationDate;
	}

	public JobApplication() {
		super();
	}

	public JobApplication(Job job, User user, String resumeUrl, String applicationStatus, Instant applicationDate) {
		super();
		this.job = job;
		this.user = user;
		this.resumeUrl = resumeUrl;
		this.applicationStatus = applicationStatus;
		this.applicationDate = applicationDate;
	}

	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", job=" + job + ", user=" + user + ", resumeUrl="
				+ resumeUrl + ", applicationStatus=" + applicationStatus + ", applicationDate=" + applicationDate + "]";
	}

}

