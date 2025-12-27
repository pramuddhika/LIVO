package com.livo.system.payments;

import java.time.Month;
import java.time.Year;
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
@Table(name = "payments")
public class PaymentsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id", nullable = false , unique = true)
	private Long id;
	
	@Column(name = "amount", nullable = false)
	private Double amount;
	
	@Column(name = "payment_date", nullable = false)
	private Date paymentDate;
	
	@Column(name = "payment_month", nullable = false)
	private Month paymentMonth;
	
	@Column(name = "payment_year", nullable = false)
	private Year paymentYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", nullable = false)
    private UserEntity modifiedBy;
	
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;
}
