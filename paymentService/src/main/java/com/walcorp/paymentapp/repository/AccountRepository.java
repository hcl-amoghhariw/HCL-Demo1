package com.walcorp.paymentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walcorp.paymentapp.domain.Account;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Integer> {

}
