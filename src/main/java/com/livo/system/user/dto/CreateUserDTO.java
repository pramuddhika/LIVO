package com.livo.system.user.dto;

import java.util.Date;

import com.livo.system.user.RoleEntity;

public class CreateUserDTO {
	
	private String name;
	private String email;
	private String contact_number;
	private Boolean status;
	private RoleEntity role_id;
	private Date created_date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public RoleEntity getRole_id() {
		return role_id;
	}
	public void setRole_id(RoleEntity role_id) {
		this.role_id = role_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
}
