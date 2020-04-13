package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountRepository 
{
	public void createAccount(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	public void deleteByAccountNumber(String accountNumber);
	public void deleteAll();
	public void updateBalance(String accountNumber,float balance);
}
