package com.hiring.job;
import java.util.Date;

import com.hiring.client.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    private String title;

    private String description;

    private String requirements;

    private String location;

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private Date datePosted;

    private Date expirationDate;

    private Boolean isFeatured;

    private Boolean isActive;

    private Integer requiredExperience;

    private Boolean remote;

    private String benefits;

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Boolean getIsFeatured() {
		return isFeatured;
	}

	public void setIsFeatured(Boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(Integer requiredExperience) {
		this.requiredExperience = requiredExperience;
	}

	public Boolean getRemote() {
		return remote;
	}

	public void setRemote(Boolean remote) {
		this.remote = remote;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public Job(String title, String description, String requirements, String location, Double salary, Client client,
			Date datePosted, Date expirationDate, Boolean isFeatured, Boolean isActive, Integer requiredExperience,
			Boolean remote, String benefits) {
		super();
		this.title = title;
		this.description = description;
		this.requirements = requirements;
		this.location = location;
		this.salary = salary;
		this.client = client;
		this.datePosted = datePosted;
		this.expirationDate = expirationDate;
		this.isFeatured = isFeatured;
		this.isActive = isActive;
		this.requiredExperience = requiredExperience;
		this.remote = remote;
		this.benefits = benefits;
	}

	public Job() {
		super();
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", description=" + description + ", requirements="
				+ requirements + ", location=" + location + ", salary=" + salary + ", client=" + client
				+ ", datePosted=" + datePosted + ", expirationDate=" + expirationDate + ", isFeatured=" + isFeatured
				+ ", isActive=" + isActive + ", requiredExperience=" + requiredExperience + ", remote=" + remote
				+ ", benefits=" + benefits + "]";
	}


    
}
