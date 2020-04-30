package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SchoolController 
{
	@Autowired
	private RestTemplate rest;
	@GetMapping("/students/{school}")
	public List<Object> getStudent(@PathVariable String school)
	{
		return (List<Object>) rest.getForObject("http://STUDENT-SERVICE/student/{schoolName}", Object.class,school);
	}
}
