package com.example.practice;

import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
public class Address 
{
	private String addressLine1;
	private String addressLine2;
	public String address()
	{
		return "address";
	}

}