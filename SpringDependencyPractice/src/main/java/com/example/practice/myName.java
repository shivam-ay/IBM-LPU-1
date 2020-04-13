package com.example.practice;

import lombok.Setter;

@Setter
public class myName implements Name
{
	private Address address;
	public String name()
	{
		return "name";
	}
	
	public String address()
	{
		return address.address();
	}
}
