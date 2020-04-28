package com.example.demo.service;

import com.example.demo.model.Product;

public interface ProductService
{
	public Iterable<Product> getProducts();
	public Product findById(int id);
	public Product saveProduct(Product product);
}
