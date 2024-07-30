package com.walcorp.paymentapp.domain;

import java.time.LocalDate;

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
@Table(name="EmploymentDetails")
public class Employment {
	
	@Id
	@Column(name = "employment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String organizationName;

	@Column
	private LocalDate startDate=LocalDate.now();

	@Column
	private LocalDate endDate;

	@Column
	private String address;

}
