package com.livo.system.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livo.system.user.dto.CreateRoleDTO;
import com.livo.system.user.service.RoleService;
import com.livo.system.utils.ApiResponse;
import com.livo.system.utils.ExtracValidationMessage;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	@PostMapping("/create")
	public ApiResponse<?> createRole(@Valid @RequestBody CreateRoleDTO createRoleDTO) {
		try {
			roleService.createRole(createRoleDTO);
			return ApiResponse.success("Role created successfully", null);
		} catch (Exception e) {
			String validationMessage = ExtracValidationMessage.extractValidationMessage(e);
			if (validationMessage != null) {
				return ApiResponse.error(validationMessage);
			}
			return ApiResponse.error("An error occurred while creating the user: " + e.getMessage());
		}
	}
	
}
