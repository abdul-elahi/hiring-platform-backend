package com.hiring.user.service;

import org.springframework.stereotype.Service;

import com.hiring.commons.Document;
import com.hiring.user.User;

@Service
public interface UserService {

	Document<?> getAllUsersData();

	Document<?> findByUserId(Long id);

	Document<?> saveNewUser(User user);

	Document<?> getUsersDataCompletely();

}
