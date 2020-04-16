package com.example.demo.EmployeeDao;

import java.util.Collection;

import com.example.demo.entity.Employee;

public interface EmployeeDao 
{
	public Employee createEmployee(Employee employee);
	public void removeEmployee(int id);
	public Employee raiseEmployeeSalary(int id,int raise);
	public Employee findEmployee(int id);
	public Collection<Employee> getAllEmployee();
}
