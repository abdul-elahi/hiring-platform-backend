package com.hiring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hiring.commons.Document;
import com.hiring.user.dto.UserRegisterCompleteDTO;
import com.hiring.user.dto.UserRegisterDTO;
import com.hiring.user.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/find-all-users")
	ResponseEntity<?> findAllUsers() {
		Document<?> user = userService.getAllUsersData();
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}

	@GetMapping(value = "/find-by-userid/{userId}")
	ResponseEntity<?> findByUserId(@PathVariable Long userId) {
		Document<?> user = userService.findByUserId(userId);
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}

	@PostMapping(value = "/save-new-user")
	ResponseEntity<?> saveNewUser(@RequestBody UserRegisterDTO user) {
		Document<?> document = userService.saveNewUser(user);
		return ResponseEntity.status(document.getStatusCode()).body(document);
	}
	
	@PostMapping(value = "/save-new-candidate")
	ResponseEntity<?> saveNewCandidate(@RequestBody UserRegisterCompleteDTO user) {
		Document<?> document = userService.saveNewCandidate(user);
		return ResponseEntity.status(document.getStatusCode()).body(document);
	}

	@PostMapping(value = "/save-file", consumes = { "multipart/form-data" })
	ResponseEntity<?> saveFile(@RequestParam("resume") MultipartFile resume, Long userId) {
		Document<?> document = userService.uploadResumeForUser(resume,userId);
		return  ResponseEntity.status(document.getStatusCode()).body(document);
	}

	@GetMapping(value = "/get-complete-users-data")
	ResponseEntity<?> findCompleteUsersDetails() {
		Document<?> user = userService.getUsersDataCompletely();
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}

}
