package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerConrtoller 
{
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customers")
	public List<Customer> getAll()
	{
		return customerService.getAll();
	}
}
