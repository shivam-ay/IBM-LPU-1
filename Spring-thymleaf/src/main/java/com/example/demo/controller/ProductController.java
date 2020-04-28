package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public abstract class ProductController 
{
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService)
	{
		this.productService = productService;
	}
	
	@RequestMapping("/")
	public String hello(Model model) 
	{
		model.addAttribute("theTime",new Date());
		return "index";
	}
	
	@RequestMapping("/products")
	public String listProducts(Model model)
	{
		model.addAttribute("products",productService.getProducts());
		return "products";
	}
	
	@RequestMapping("/products/{id}")
	public String getById(Model model, @PathVariable int id)
	{
		model.addAttribute("product",productService.findById(id));
		return "product";
	}
	@RequestMapping("/product/new")
	public String newProduct(Model model)
	{
		model.addAttribute("product",new Product());
		return "productform";
	}
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String saveProduct(Product product)
	{
		productService.saveProduct(product);
		return "redirect:/products/";
	}
	@RequestMapping("product/new/{id}")
	public String getForm(Model model,@PathVariable int id)
	{
		Product product = productService.findById(id);
		model.addAttribute("product",product);
		return "productfrom";
	}
	@RequestMapping(value = "/products",method = RequestMethod.PUT)
	public String updateProduct(Product product)
	{
		productService.saveProduct(product);
		return "redirect:/products/";
	}
}
