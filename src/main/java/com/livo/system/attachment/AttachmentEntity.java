package com.livo.system.attachment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attachments")
public class AttachmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attachment_id", nullable = false , unique = true)
	private Long id;
	
	@Column(name = "file_name", nullable = false , length = 255)
	private String fileName;
	
	@Column(nullable = false)
	private String module;

	@Column(nullable = false)
	private Long moduleId;
}
