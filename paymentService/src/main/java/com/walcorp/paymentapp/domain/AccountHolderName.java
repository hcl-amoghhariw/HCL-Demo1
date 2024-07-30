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
@Table(name="AccountHolderDetails")
public class AccountHolderName {
    
	@Id
	@Column(name = "account_holderdetails_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String firstNmae;

	@Column
	private String lastName;

	@Column
	private String middleName;
	
	@Column
	private int age;

	@Column
	private String gender;

}
