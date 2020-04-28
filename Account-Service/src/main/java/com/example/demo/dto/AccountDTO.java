package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AccountDTO 
{
	private Integer customerId;
	private String number;
	
	public AccountDTO(Integer customerId, String number) 
	{
		super();
		this.customerId = customerId;
		this.number = number;
	}
	
}
