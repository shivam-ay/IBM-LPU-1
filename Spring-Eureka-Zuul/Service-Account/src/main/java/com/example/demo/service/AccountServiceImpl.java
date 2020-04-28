package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService
{
	@Autowired
	private AccountDAO accountDAO;
	@Override
	public List<Account> getAll() 
	{
		List<Account> account = new ArrayList<>();
		for(Account ac:accountDAO.findAll())
		{
			account.add(ac);
		}
		return account;
	}

}
