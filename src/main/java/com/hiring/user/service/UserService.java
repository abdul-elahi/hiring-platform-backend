package com.hiring.user.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hiring.commons.Document;
import com.hiring.user.dto.UserRegisterCompleteDTO;
import com.hiring.user.dto.UserRegisterDTO;

@Service
public interface UserService {

	Document<?> getAllUsersData();

	Document<?> findByUserId(Long id);

	Document<?> getUsersDataCompletely();

	Document<?> saveNewUser(UserRegisterDTO userRegisterDTO);

	Document<?> uploadResumeForUser(MultipartFile resume, Long userId);

	Document<?> saveNewCandidate(UserRegisterCompleteDTO userRegisterDTO);

}
