package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService 
{
	public void createAccount(Account account);
	public List<Account> displayAccount();
	public Account findByAccountNumber(String accountNumber);
	public void deleteByAccountNumber(String accountNumber);
	public void deleteAll();
	public void updateBalance(String accountNumber,float balance);
}
