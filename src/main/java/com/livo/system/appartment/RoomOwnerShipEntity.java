package com.livo.system.appartment;

import java.util.Date;

import com.livo.system.user.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_ownerships")
public class RoomOwnerShipEntity {
	
	@EmbeddedId
	private RoomOwnerShipId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("roomId")
	@JoinColumn(name = "room_id")
	private RoomsEntity room;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("ownerId")
    @JoinColumn(name = "owner_id") 
    private UserEntity owner;
	
	@Column(name = "status" , nullable = false)
	private Boolean status;
	
	@Column(name = "modified_by" , nullable = false)
	private Long modifiedBy;
	
	@Column(name = "modified_date" , nullable = false)
	private Date modifiedDate;
	
	@Column(name = "residence_count" , nullable = false)
	private Integer residenceCount;
	
	@Column(name = "rented_date" , nullable = true)
	private Date rentedDate;
	
	@Column(name = "leved_date" , nullable = true)
	private Date levedDate;

}
