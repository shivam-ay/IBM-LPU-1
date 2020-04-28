package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceAccountApplication implements CommandLineRunner
{
	@Autowired
	private AccountDAO accountDAO;
	public static void main(String[] args) {
		SpringApplication.run(ServiceAccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		accountDAO.save(new Account(UUID.randomUUID().toString()));
	}

}
