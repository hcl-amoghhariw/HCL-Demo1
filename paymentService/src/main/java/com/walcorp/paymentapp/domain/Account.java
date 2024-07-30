package com.walcorp.paymentapp.domain;



import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table(name="Account")
@Entity
public class Account {

	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Min(value = 1)
	private Integer id;
	
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private AccountHolderName  name;
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Address address;
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Employment employment;
	
	
	
	
}
