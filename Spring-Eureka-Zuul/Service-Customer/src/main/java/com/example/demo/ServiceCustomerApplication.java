package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceCustomerApplication implements CommandLineRunner
{
	@Autowired
	private CustomerDAO customerDAO;

	public static void main(String[] args) 
	{
		SpringApplication.run(ServiceCustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		customerDAO.save(new Customer("name"));
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
