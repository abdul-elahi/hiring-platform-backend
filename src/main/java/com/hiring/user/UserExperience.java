package com.hiring.user;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "experiences")
public class UserExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long experienceId;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "responsibilities")
    private String responsibilities;
    
    @Column(name="experience")
    private Integer experience;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

	public UserExperience() {
		super();
	}

	public Long getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Long experienceId) {
		this.experienceId = experienceId;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserExperience(Long experienceId, String company, String position, LocalDate startDate, LocalDate endDate,
			String responsibilities, User user) {
		super();
		this.experienceId = experienceId;
		this.company = company;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
		this.responsibilities = responsibilities;
		this.user = user;
	}

	public UserExperience(String company, String position, LocalDate startDate, LocalDate endDate,
			String responsibilities,Integer experience, User user) {
		super();
		this.experience = experience;
		this.company = company;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
		this.responsibilities = responsibilities;
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserExperience [experienceId=" + experienceId + ", company=" + company + ", position=" + position
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", responsibilities=" + responsibilities
				+ ", user=" + user + "]";
	}
    
    

}
