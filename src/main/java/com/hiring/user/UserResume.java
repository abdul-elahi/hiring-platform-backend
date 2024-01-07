package com.hiring.user;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserResume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iduser_resume")
	private Long idUserResume;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "file_location")
	private String fileLocation;
	
	private Instant createdAt;

	public UserResume() {
		super();
	}

	public Long getIdUserResume() {
		return idUserResume;
	}

	public void setIdUserResume(Long idUserResume) {
		this.idUserResume = idUserResume;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public UserResume(Long idUserResume, Long userId, String fileName, String fileLocation) {
		super();
		this.idUserResume = idUserResume;
		this.userId = userId;
		this.fileName = fileName;
		this.fileLocation = fileLocation;
	}
	
	public UserResume(Long userId, String fileName, String fileLocation,Instant createdAt) {
		super();
		this.createdAt = createdAt;
		this.userId = userId;
		this.fileName = fileName;
		this.fileLocation = fileLocation;
	}

	@Override
	public String toString() {
		return "UserResume [idUserResume=" + idUserResume + ", userId=" + userId + ", fileName=" + fileName
				+ ", fileLocation=" + fileLocation + "]";
	}
	
	
}
