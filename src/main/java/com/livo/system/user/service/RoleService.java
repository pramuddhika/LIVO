package com.livo.system.user.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livo.system.user.RoleEntity;
import com.livo.system.user.dto.CreateRoleDTO;
import com.livo.system.user.repository.RoleRepository;
import com.livo.system.utils.DateTimeUtil;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public RoleEntity createRole(CreateRoleDTO createRoleDTO) {
		//TODO : creadted by need to added
		RoleEntity role = new RoleEntity();
		
		role.setRoleName(createRoleDTO.getRole_name().toUpperCase());
		role.setStatus(createRoleDTO.getStatus());
		role.setModifiedDate(DateTimeUtil.now());
		
		return roleRepository.save(role);
	}
	
	public List<RoleEntity> getRolesByModifiedDate(Date modified_date) {
		return roleRepository.findAllByOrderByModifiedDateDesc();
	}
	
	

	
}
