package com.hiring.user.dto;

import java.time.Instant;

import com.hiring.user.UserEducation;
import com.hiring.user.UserExperience;

public class UserRegisterCompleteDTO {
	
    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String mobileNumber;

    private Instant registrationDate;
    
    private UserEducation userEducation;
    
    private UserExperience userExperience;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Instant getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}

	public UserEducation getUserEducation() {
		return userEducation;
	}

	public void setUserEducation(UserEducation userEducation) {
		this.userEducation = userEducation;
	}

	public UserExperience getUserExperience() {
		return userExperience;
	}

	public void setUserExperience(UserExperience userExperience) {
		this.userExperience = userExperience;
	}

	public UserRegisterCompleteDTO(String firstName, String lastName, String password, String email,
			String mobileNumber, Instant registrationDate, UserEducation userEducation, UserExperience userExperience) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.registrationDate = registrationDate;
		this.userEducation = userEducation;
		this.userExperience = userExperience;
	}

	public UserRegisterCompleteDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserRegisterCompleteDTO [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", registrationDate=" + registrationDate
				+ ", userEducation=" + userEducation + ", userExperience=" + userExperience + "]";
	}

}
