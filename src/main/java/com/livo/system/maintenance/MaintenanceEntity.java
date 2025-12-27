package com.livo.system.maintenance;

import java.util.Date;

import com.livo.system.user.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class MaintenanceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maintenance_id", nullable = false , unique = true)
	private Long id;
	
	@Column(name = "title", nullable = false , length = 100)
	private String title;
	
	@Column(name = "description", nullable = false , length = 255)
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by", nullable = false)
	private UserEntity createdBy;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modified_by", nullable = true)
	private UserEntity modifiedBy;
	
	@Column(name = "modified_date", nullable = true)
	private Date modifiedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assigned_to", nullable = true)
	private UserEntity assignedTo;
	
	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
}
