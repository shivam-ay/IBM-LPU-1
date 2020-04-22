package com.example.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController 
{
	@RequestMapping("/register")
	public String register(Model theModel)
	{
		Person thePerson = new Person();
		theModel.addAttribute("person",thePerson);
		return "register-form";
	}
	
	@RequestMapping("/processForm") 	
	public String processForm(@ModelAttribute("person") Person thePerson)
	{
		thePerson.setId(UUID.randomUUID().toString());
//		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
//		Session session = factory.openSession();
//		session.getTransaction().begin();
//		session.save(thePerson);
//		session.getTransaction().commit();
//		session.close();
		return "user-validation";
	}
}
