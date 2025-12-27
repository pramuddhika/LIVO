package com.livo.system.appartment;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RoomOwnerShipId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "room_id")
	private String roomId;
	@Column(name = "owner_id")
	private Long ownerId;

	public RoomOwnerShipId() {
	}

	public RoomOwnerShipId(String roomId, Long ownerId) {
		this.roomId = roomId;
		this.ownerId = ownerId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomOwnerShipId that = (RoomOwnerShipId) o;

		if (!roomId.equals(that.roomId)) return false;
		return ownerId.equals(that.ownerId);
	}

	@Override
	public int hashCode() {
		int result = roomId.hashCode();
		result = 31 * result + ownerId.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "RoomOwnerShipId [roomId=" + roomId + ", ownerId=" + ownerId + "]";
	}

}
