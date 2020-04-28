package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDTO;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController 
{
	private AccountService accountService;
	@Autowired
	public AccountController(AccountService accountService)
	{
		this.accountService =  accountService;
	}
	@RequestMapping(value = "/accounts",method = RequestMethod.GET)
	public ResponseEntity<List<AccountDTO>> getAllAccounts()
	{
		return accountService.getAllAccounts();
	}
	@RequestMapping("/account/{id}")
	public ResponseEntity<AccountDTO> getById(Integer id)
	{
		return accountService.getById(id);
	}
	@RequestMapping("/accounts/{number}")
	public ResponseEntity<List<AccountDTO>> getByNumber(String number)
	{
		return accountService.getByAccountNumber(number);
	}
}
