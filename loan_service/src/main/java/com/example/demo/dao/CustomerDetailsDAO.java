package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerDetails;

@Repository(value = "customerDetails")
public interface CustomerDetailsDAO extends JpaRepository<CustomerDetails, Long>
{
	
}
