package com.livo.system.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livo.system.user.UserEntity;
import com.livo.system.user.dto.CreateUserDTO;
import com.livo.system.user.repository.UserRespository;
import com.livo.system.utils.DateTimeUtil;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userRespository;
	
	public UserEntity createUser(CreateUserDTO createUserDTO) {
		UserEntity user = new UserEntity();
		
		user.setName(createUserDTO.getName());
		user.setEmail(createUserDTO.getEmail());
		user.setContactNumber(createUserDTO.getContactNumber());
		user.setStatus(createUserDTO.getStatus());
		user.setRoleId(createUserDTO.getRoleId());
		user.setCreatedDate(DateTimeUtil.today());
		
		return userRespository.save(user);
	}

}
