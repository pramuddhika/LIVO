package com.livo.system.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livo.system.user.dto.CreateUserDTO;
import com.livo.system.user.service.UserService;
import com.livo.system.utils.ApiResponse;
import com.livo.system.utils.ExtracValidationMessage;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/user")
public class UserCotroller {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/create")
	public ApiResponse<?> createUser(@Valid @RequestBody CreateUserDTO createUserDTO) {
		try {
			userService.createUser(createUserDTO);
			return ApiResponse.success("User created successfully", null);
		} catch (Exception e) {
			String validationMessage = ExtracValidationMessage.extractValidationMessage(e);
			if (validationMessage != null) {
                return ApiResponse.error(validationMessage);
            }
			return ApiResponse.failure("Failed to create user", null);
		}
	}

}
