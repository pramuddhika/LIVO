package com.livo.system.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livo.system.user.RoleEntity;
import com.livo.system.user.UserEntity;
import com.livo.system.user.dto.CreateUserDTO;
import com.livo.system.user.repository.RoleRepository;
import com.livo.system.user.repository.UserRespository;
import com.livo.system.utils.DateTimeUtil;

@Service
public class UserService {

	@Autowired
	private UserRespository userRespository;
	
	@Autowired
	private RoleRepository roleRepository;


	public UserEntity createUser(CreateUserDTO createUserDTO) {
		RoleEntity role = roleRepository
				.findById(createUserDTO.getRole_id())
				.orElseThrow(() -> new RuntimeException("Role not found"));
		
		UserEntity user = new UserEntity();

		user.setName(createUserDTO.getName());
		user.setEmail(createUserDTO.getEmail());
		user.setContactNumber(createUserDTO.getContactNumber());
		user.setStatus(createUserDTO.getStatus());
		user.setRole(role);;
		user.setCreatedDate(DateTimeUtil.now());
		user.setUpdatedDate(DateTimeUtil.now());

		return userRespository.save(user);
	}

}
