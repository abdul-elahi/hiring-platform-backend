package com.hiring.client;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;

    private String description;

    private String industry;

    private String location;

    private String website;

    private String contactEmail;

    private Date onboardedDate;

    private Integer size;

    private String phoneNumber;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Date getOnboardedDate() {
		return onboardedDate;
	}

	public void setOnboardedDate(Date onboardedDate) {
		this.onboardedDate = onboardedDate;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Client() {
		super();
	}

	public Client(String name, String description, String industry, String location, String website,
			String contactEmail, Date onboardedDate, Integer size, String phoneNumber) {
		super();
		this.name = name;
		this.description = description;
		this.industry = industry;
		this.location = location;
		this.website = website;
		this.contactEmail = contactEmail;
		this.onboardedDate = onboardedDate;
		this.size = size;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", description=" + description + ", industry="
				+ industry + ", location=" + location + ", website=" + website + ", contactEmail=" + contactEmail
				+ ", onboardedDate=" + onboardedDate + ", size=" + size + ", phoneNumber=" + phoneNumber + "]";
	}

	
    
}
