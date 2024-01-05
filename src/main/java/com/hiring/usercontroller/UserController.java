package com.hiring.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiring.commons.Document;
import com.hiring.user.User;
import com.hiring.user.service.UserService;

@RestController
@RequestMapping(value ="/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value ="/find-all-users")
	ResponseEntity<?> findAllUsers(){
		Document<?> user = userService.getAllUsersData();
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}
	
	@GetMapping(value ="/find-by-userid/{userId}")
	ResponseEntity<?> findByUserId(@PathVariable Long userId){
		Document<?> user = userService.findByUserId(userId);
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}
	
	@PostMapping(value ="/save-new-user")
	ResponseEntity<?> saveNewUser(@RequestBody User user){
		Document<?> document = userService.saveNewUser(user);
		return ResponseEntity.status(document.getStatusCode()).body(document);
	}
	
	@GetMapping(value ="/get-complete-users-data")
	ResponseEntity<?> findCompleteUsersDetails(){
		Document<?> user = userService.getUsersDataCompletely();
		return ResponseEntity.status(user.getStatusCode()).body(user);
	}

}
