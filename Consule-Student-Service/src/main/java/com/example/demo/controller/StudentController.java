package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	@GetMapping("/student/{schoolName}")
	public ResponseEntity<Iterable<Student>> getBySchoolName(@PathVariable String schoolName)
	{
		return studentService.getBySchoolName(schoolName);
	}
}
