package com.hiring.user.dto;

import java.time.Instant;

public class UserRegisterDTO {

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String mobileNumber;

    private String role;

    private Instant registrationDate;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Instant getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}

	public UserRegisterDTO(String firstName, String lastName, String password, String email,
			String mobileNumber, String role, Instant registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.role = role;
		this.registrationDate = registrationDate;
	}

	public UserRegisterDTO() {
		super();
	}
 
}

