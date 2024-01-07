package com.hiring.user.dto;
import java.time.LocalDate;

public class UserExperienceAndEducationDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    
    private String company;
    private LocalDate startDate;
    private LocalDate endDate;
    private String position;
    private Integer experience;
    
    private String degree;
    private String institution;
    private String major;
    private LocalDate graduationDate;
    
    private String resumeLocaton;

    public UserExperienceAndEducationDTO() {
    	
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
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

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getResumeLocaton() {
		return resumeLocaton;
	}

	public void setResumeLocaton(String resumeLocaton) {
		this.resumeLocaton = resumeLocaton;
	}



	
	public UserExperienceAndEducationDTO(String firstName, String lastName, String email, String mobileNumber,
			String company, LocalDate startDate, LocalDate endDate, String position, Integer experience, String degree,
			String institution, String major, LocalDate graduationDate, String resumeLocaton) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.company = company;
		this.startDate = startDate;
		this.endDate = endDate;
		this.position = position;
		this.experience = experience;
		this.degree = degree;
		this.institution = institution;
		this.major = major;
		this.graduationDate = graduationDate;
		this.resumeLocaton = resumeLocaton;
	}

	@Override
	public String toString() {
		return "UserExperienceAndEducationDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", company=" + company + ", position=" + position + ", experience="
				+ experience + ", degree=" + degree + ", major=" + major + ", graduationDate=" + graduationDate + "]";
	}
    
    


}
