package com.walcorp.paymentapp.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentData {

	private String paymentName;

	private AddressData addressdata;

}
