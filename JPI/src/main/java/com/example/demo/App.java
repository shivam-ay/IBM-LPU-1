package com.example.demo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeService service = context.getBean("service",EmployeeServiceImpl.class);
    	int choice;
    	Scanner sc = new Scanner(System.in);
    	do
    	{
    		System.out.println("1.Add new employee");
    		System.out.println("2.Remove an employee");
    		System.out.println("3.Raise salary of employee");
    		System.out.println("4.Find employee by id");
    		System.out.println("5.Get all employees");
    		System.out.println("Enter choice");
    		choice = sc.nextInt();
    		
    	}while(choice != 6);
    }
}
