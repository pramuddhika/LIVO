package com.livo.system.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livo.system.user.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	
	List<RoleEntity>findAllByOrderByModifiedDateDesc();
	

}
