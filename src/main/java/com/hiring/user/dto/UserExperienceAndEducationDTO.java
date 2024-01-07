package com.hiring.user.dto;
import java.time.LocalDate;

public class UserExperienceAndEducationDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    
    private String company;
    private String position;
    private Integer experience;
    private String degree;
    private String major;
    private LocalDate graduationDate;

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

	public UserExperienceAndEducationDTO(String firstName, String lastName, String email, String mobileNumber,
			String company, String position, Integer experience, String degree, String major,
			LocalDate graduationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.company = company;
		this.position = position;
		this.experience = experience;
		this.degree = degree;
		this.major = major;
		this.graduationDate = graduationDate;
	}

	@Override
	public String toString() {
		return "UserExperienceAndEducationDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", company=" + company + ", position=" + position + ", experience="
				+ experience + ", degree=" + degree + ", major=" + major + ", graduationDate=" + graduationDate + "]";
	}
    
    


}
