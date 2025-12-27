package com.livo.system.appartment;

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
@Table(name = "appartments")
public class AppartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appartment_id", nullable = false , unique = true)
	private Long id;
	@Column(name = "appartment_name", nullable = false , length = 100)
	private String name;
	@Column(name = "status", nullable = false, length = 1)
	private Boolean status;
	@Column(name = "address_line1", nullable = false , length = 255)
	private String addressLine1;
	@Column(name = "address_line2", nullable = true , length = 255)
	private String addressLine2;
	@Column(name = "city", nullable = false , length = 100)
	private String city;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private UserEntity role;

}
