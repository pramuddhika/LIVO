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
	
	public void setRole_id(Long role_id2) {
		this.role_id = role_id2;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getModifyed_by() {
		return modifyed_by;
	}

	public void setModifyed_by(String modifyed_by) {
		this.modifyed_by = modifyed_by;
	}

	public Date getModifyed_date() {
		return modifyed_date;
	}

	public void setModifyed_date(Date modifyed_date) {
		this.modifyed_date = modifyed_date;
	}

	public Long getRole_id() {
		return role_id;
	}
	
}
