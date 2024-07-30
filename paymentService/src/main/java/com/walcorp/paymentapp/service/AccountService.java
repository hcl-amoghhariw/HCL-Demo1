package com.walcorp.paymentapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.walcorp.paymentapp.domain.Account;
import com.walcorp.paymentapp.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account save(Account data) {
		return accountRepository.save(data);

	}

	public Account update(Account data) throws Exception {
		accountRepository.findById(data.getId()).ifPresentOrElse(entity -> {
			data.getName().setId(entity.getName().getId());
			data.getEmployment().setId(entity.getEmployment().getId());
			accountRepository.save(data);
		}, () -> {
		System.out.println("::::::Data not found ::::"); 
		throw new RuntimeException("Data not found" + data);
		});
		return data;
	}

	public Optional<Account> findBy(int accountNumber) {
		return accountRepository.findById(accountNumber);

	}

}
