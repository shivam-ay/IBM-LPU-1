package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService 
{
	private AccountDAO accountDAO;
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO)
	{
		this.accountDAO = accountDAO;
	}
	@Override
	public ResponseEntity<List<AccountDTO>> getAllAccounts() 
	{
		List<AccountDTO> accounts = new ArrayList<>();
		for(Account account:accountDAO.findAll())
		{
			accounts.add(new AccountDTO(account.getCustomerId(),account.getNumber()));
		}
		return ResponseEntity.ok().body(accounts); 	
	}

	@Override
	public ResponseEntity<AccountDTO> getById(Integer id) 
	{
		Account getAccount = accountDAO.findById(id).get();
		AccountDTO account = new AccountDTO(getAccount.getCustomerId(),getAccount.getNumber());
		return ResponseEntity.ok().body(account);
	}

	@Override
	public ResponseEntity<List<AccountDTO>> getByAccountNumber(String number)
	{
		List<AccountDTO> account = new ArrayList<>();
		for(Account get:accountDAO.findByNumber(number))
		{
			account.add(new AccountDTO(get.getCustomerId(),get.getNumber()));
		}
		return ResponseEntity.ok().body(account);
	}

}
