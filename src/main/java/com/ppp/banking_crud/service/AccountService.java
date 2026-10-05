package com.ppp.banking_crud.service;

import java.util.List;

import com.ppp.banking_crud.dto.AccountDto;


public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto) ;
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	AccountDto withdraw(Long id, double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);
	
}
