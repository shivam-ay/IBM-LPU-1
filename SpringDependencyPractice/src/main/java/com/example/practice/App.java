package com.example.practice;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Name theName = context.getBean(Name.class);
    	System.out.println(theName.name());
    	System.out.println(theName.address());
    	Customer customer=context.getBean("theCustomer",Customer.class);
		customer.setCustomerID(UUID.randomUUID().toString());
		System.out.println(customer);
    }
}
