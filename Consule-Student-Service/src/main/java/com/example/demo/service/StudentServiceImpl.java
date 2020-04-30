package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@Service(value="studentServvice")
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDAO studentDAO;
	@Override
	public ResponseEntity<Iterable<Student>> getBySchoolName(String schoolName)
	{
		List<Student> student = new ArrayList<>();
		for(Student stud:studentDAO.getBySchoolName(schoolName))
		{
			student.add(stud);
		}
		return ResponseEntity.ok().body(student);
	}

}
