package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoanDetailsDAO;
import com.example.demo.entity.LoanDetails;
import com.example.demo.entity.LoanDetails.status;

@Service(value = "loanDetailsService")
public class LoanDetailsServiceImpl implements LoanDetailsService
{

	@Autowired
	private LoanDetailsDAO loanDetailsDAO;
	@Override
	public void createLoanRequest(LoanDetails loanDetails)
	{
		double emi = (loanDetails.getLoanAmount()*loanDetails.getInterestRate()*(Math.pow((1+loanDetails.getInterestRate()),(loanDetails.getDuration()/12)))/(Math.pow((1+loanDetails.getInterestRate()), ((loanDetails.getDuration()/12)-1))));
		loanDetails.setEmi(emi);
		loanDetailsDAO.save(loanDetails);
	}

	@Override
	public ResponseEntity<List<LoanDetails>> showLoanDetails() 
	{
		return ResponseEntity.ok().body(loanDetailsDAO.findAll());
	}

	@Override
	public void deleteLoanRequest(long id) 
	{
		if(loanDetailsDAO.findById(id).isPresent())
		{
			loanDetailsDAO.delete(loanDetailsDAO.findById(id).get());
		}
	}

	@Override
	public ResponseEntity<List<LoanDetails>> showLoanByStatus(status loanStatus) 
	{
		return ResponseEntity.ok().body(loanDetailsDAO.findByLoanStatus(loanStatus));
	}

}
