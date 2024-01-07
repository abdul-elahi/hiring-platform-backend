package com.hiring.user;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserResume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iduser_resume")
	private Long idUserResume;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "file_location")
	private String fileLocation;

	@Column(name = "created_at")
	private Instant createdAt;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public UserResume() {
		super();
	}

	public Long getIdUserResume() {
		return idUserResume;
	}

	public void setIdUserResume(Long idUserResume) {
		this.idUserResume = idUserResume;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public UserResume(User user, String fileName, String fileLocation, Instant createdAt) {
		super();
		this.createdAt = createdAt;
		this.user = user;
		this.fileName = fileName;
		this.fileLocation = fileLocation;
	}

	@Override
	public String toString() {
		return "UserResume [idUserResume=" + idUserResume + ", userId=" + user + ", fileName=" + fileName
				+ ", fileLocation=" + fileLocation + "]";
	}

}
