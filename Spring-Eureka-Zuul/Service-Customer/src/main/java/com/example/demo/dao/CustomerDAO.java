package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository(value = "customerDAO")
public interface CustomerDAO extends CrudRepository<Customer,Integer>
{

}
