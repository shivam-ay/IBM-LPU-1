package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	public Employee createEmployee(Employee employee);
	public void removeEmployee(int id);
	public Employee raiseEmployeeSalary(int id,int raise);
	public Employee findEmployee(int id);
	public Collection<Employee> getAllEmployee();
}
