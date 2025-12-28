package com.livo.system.user;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name = "name", nullable = false)
	private String name;
	
	@Email(message = "Email should be valid")
	@Column(name = "email", nullable = false , unique = true , length = 100)
	private String email;
	
	@NotBlank(message = "Contact Number is mandatory")
	@Column(name = "contactNumber", nullable = false , length = 100)
	private String contactNumber;
	
	@Column(name = "createdDate", nullable = false , length = 15)
	private Date createdDate;
	@Column(name = "updatedDate", nullable = false )
	private Date updatedDate;
	
	@Column(name = "password", nullable = true , length = 255)
	private String password;
	@Column(name = "status", nullable = false)
	private Boolean status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleId", nullable = false)
	private RoleEntity roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		
}
