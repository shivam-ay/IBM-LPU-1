package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person 
{
	private String name = "pName";
	private int age = 10;
	private float height = 8.0f;
	private boolean isProgrammer = true;
	private Address address;
}
