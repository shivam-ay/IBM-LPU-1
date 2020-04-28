package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository(value = "productDAO")
public interface ProductDAO extends CrudRepository<Product,Integer>
{

}
