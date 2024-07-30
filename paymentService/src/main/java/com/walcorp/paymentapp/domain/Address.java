package com.walcorp.paymentapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "AccountHolderAddress")
public class Address {

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String doorNo;

	@Column
	private String streetName;

	@Column
	private String city;

	@Column
	private String state;

	@Column
	private String country;

}
