package com.livo.system.user;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false , unique = true )
	private Long role_id;
	@Column(name = "role_name", nullable = false , unique = true , length = 100 )
	private String role_name;
	@Column(name = "status", nullable = false )
	private Boolean status;
	@Column(name = "modifyed_by", nullable = true )
	private String modifyed_by;
	@Column(name = "modifyed_date", nullable = true)
	private Date modifyed_date;
	
}
