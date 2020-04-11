package com.example.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Person;

public class PersonInfoDaoImpl implements PersonInfoDao
{
	@Override
	public void getPersonInfo()
	{
		ClassPathXmlApplicationContext conetxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = conetxt.getBean("Person",Person.class);
		System.out.println(person+" "+person.getAddress());
	}
}
