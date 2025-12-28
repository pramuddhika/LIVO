package com.livo.system.user.dto;

import java.sql.Date;

public class CreateRoleDTO {

	private String role_name;
	private Boolean status;
	private Long modified_by;
	private Date modified_date;
	
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
	public Long getModified_by() {
		return modified_by;
	}
	public void setModified_by(Long modified_by) {
		this.modified_by = modified_by;
	}
	public Date getModified_date() {
		return modified_date;
	}
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	public CreateRoleDTO(String role_name, Boolean status, Long modified_by, Date modified_date) {
		super();
		this.role_name = role_name;
		this.status = status;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}
	
	public CreateRoleDTO() {
	}
	
}
