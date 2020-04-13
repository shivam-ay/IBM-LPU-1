package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService
{
	private AccountRepository accountRepo;
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepo)
	{
		this.accountRepo = accountRepo;
	}
	
	public void createAccount(Account account)
	{
		accountRepo.createAccount(account);
	}
	@Override
	public List<Account> displayAccount()
	{
		return accountRepo.getAllAccountDetails();
	}
	@Override
	public Account findByAccountNumber(String accountNumber) 
	{
		return accountRepo.findByAccountNumber(accountNumber);	
	}
	@Override
	public void deleteByAccountNumber(String accountNumber) 
	{
		accountRepo.deleteByAccountNumber(accountNumber);
	}
	@Override
	public void deleteAll() 
	{
		accountRepo.deleteAll();
	}
	@Override
	public void updateBalance(String accountNumber, float balance)
	{
		accountRepo.updateBalance(accountNumber, balance);
	}
}
