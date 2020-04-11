package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address 
{
	private int streetNumber = 1;
	private String streetName = "sName";
	private String city = "city";
	private String country = "country";
}
