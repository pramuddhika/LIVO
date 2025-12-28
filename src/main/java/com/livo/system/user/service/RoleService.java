package com.livo.system.user.service;

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
		//TODO : creadted by and creatde date need to added
		RoleEntity role = new RoleEntity();
		
		role.setRole_name(createRoleDTO.getRole_name().toUpperCase());
		role.setStatus(createRoleDTO.getStatus() != null ? createRoleDTO.getStatus() : true);
		role.setModifyed_date(DateTimeUtil.today());
		
		return roleRepository.save(role);
	}

	
}
