package com.livo.system.appartment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class RoomsEntity {

	@Id
	@Column(name = "room_id", nullable = false , unique = true)
	private String id;
	
	@Column(name = "description", nullable = false , length = 255)
	private String description;
	
	@Column(name = "status", nullable = false)
	private Boolean status;
	
	@Column(name = "capacity", nullable = false)
	private Integer capacity;
	
	@Column(name = "rent_price", nullable = false)
	private Double rentPrice;
	
	@Column(name = "is_rented", nullable = false)
	private Boolean isRented;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appartment_id", nullable = false)
	private AppartmentEntity appartment;
}
