package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeDao.EmployeeDao;
import com.example.demo.entity.Employee;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao dao;
	@Autowired
	public EmployeeServiceImpl(EmployeeDao dao)
	{
		this.dao = dao;
	}
	@Override
	public Employee createEmployee(Employee employee) 
	{
		return dao.createEmployee(employee);
	}

	@Override
	public void removeEmployee(int id) 
	{
		dao.removeEmployee(id);
	}
	@Override
	public Employee raiseEmployeeSalary(int id, int raise) 
	{
		return dao.raiseEmployeeSalary(id, raise);
	}
	@Override
	public Employee findEmployee(int id) 
	{
		return dao.findEmployee(id);
	}
	@Override
	public Collection<Employee> getAllEmployee()
	{
		return dao.getAllEmployee();
	}

}
