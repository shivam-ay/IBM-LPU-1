package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController
{
	@Autowired
	private AccountService accountService;
	@GetMapping("/accounts")
	public List<Account> getAll()
	{
		return accountService.getAll();
	}
}
