package com.livo.system.user.dto;

import java.util.Date;

import com.livo.system.user.RoleEntity;

public class CreateUserDTO {
	
	private String name;
	private String email;
	private String contactNumber;
	private Boolean status;
	private RoleEntity roleId;
	private Date createdDate;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public RoleEntity getRoleId() {
		return roleId;
	}
	public void setRoleId(RoleEntity roleId) {
		this.roleId = roleId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
