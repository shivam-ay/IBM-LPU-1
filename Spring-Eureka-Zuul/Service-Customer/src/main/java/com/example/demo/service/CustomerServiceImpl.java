package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	RestTemplate restTemplate;
	@Override
	public List<Customer> getAll() 
	{
		List<Customer> customers = new ArrayList<>();
		for(Customer cus:customerDAO.findAll())
		{
			customers.add(cus);
		}
		return customers;
	}

	@Override
	public List<Object> getAccounts()
	{
		return restTemplate.getForObject("http://ACCOUNT-SERVICE/accounts",List.class);
	}

}
