package com.ppp.banking_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppp.banking_crud.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
