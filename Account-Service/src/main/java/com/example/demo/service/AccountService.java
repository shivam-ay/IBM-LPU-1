package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.AccountDTO;

public interface AccountService 
{
	public ResponseEntity<List<AccountDTO>> getAllAccounts();
	public ResponseEntity<AccountDTO> getById(Integer id);
	public ResponseEntity<List<AccountDTO>> getByAccountNumber(String number);
}
