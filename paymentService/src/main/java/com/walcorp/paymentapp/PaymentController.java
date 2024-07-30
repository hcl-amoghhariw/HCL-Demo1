package com.walcorp.paymentapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walcorp.paymentapp.domain.Account;
import com.walcorp.paymentapp.service.AccountService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RestController
public class PaymentController {
	

	@Autowired
	private AccountService service;

	@PostMapping("/api/createaccount")
	public ResponseEntity<Account> createAccount(@RequestBody Account data) {
		log.info(data + "createAccount:  add::::::::::" + data);
		return ResponseEntity.ok(service.save(data));
	}

	@GetMapping("/api/getaccountdetails/{accountNumber}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable int accountNumber) {
		System.out.println(accountNumber + "In getAccountDetails:  add::::::::::" + accountNumber);
		return ResponseEntity.ok(service.findBy(accountNumber).get());
	}
	// setaccountdetails

	@PutMapping("/api/setaccountdetails")
	public ResponseEntity<Account> setaccountdetails(@RequestBody @Validated Account data) throws Exception {
		System.out.println(data + "setaccountdetails::::::::::" + data);
		return ResponseEntity.ok(service.update(data));
	}

}
