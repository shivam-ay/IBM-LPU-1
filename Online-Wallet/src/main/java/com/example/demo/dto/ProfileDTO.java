package com.example.demo.dto;

public class ProfileDTO 
{
	private String name;
	private long phoneNumber;
	private String email;
	private boolean status;
	
	public ProfileDTO(String name, long phoneNumber, 
					String email, boolean status) 
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.status = status;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public boolean isStatus() 
	{
		return status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	
	
}
