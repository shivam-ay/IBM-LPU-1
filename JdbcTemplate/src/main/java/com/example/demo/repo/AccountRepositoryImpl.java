package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
import com.example.demo.model.AccountMapper;

@Repository("accountRepo")
public class AccountRepositoryImpl implements AccountRepository
{
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public AccountRepositoryImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void createAccount(Account account) 
	{
		String sql = "insert into accounts(accountnumber,accounttype,initialbalance) values('"+account.getAccountNumber()+""
									+ "','"+account.getAccountType()+"',"+account.getInitialBalance()+")";
		jdbcTemplate.update(sql);
	}

	@Override
	public List<Account> getAllAccountDetails() 
	{
		String sql = "select * from accounts";
		return jdbcTemplate.query(sql,new AccountMapper());
	}

	@Override
	public Account findByAccountNumber(String accountNumber) 
	{
		String sql = "select * from accounts where accountnumber=?";
		return jdbcTemplate.queryForObject(sql,new Object[] {accountNumber}, new AccountMapper());
	}

	@Override
	public void deleteByAccountNumber(String accountNumber) 
	{
		String sql = "delete from accounts where accountnumber='"+accountNumber+"'";
		jdbcTemplate.update(sql);
	}

	@Override
	public void deleteAll() 
	{
		String sql = "delete from accounts";
		jdbcTemplate.batchUpdate(sql);
	}
	
	@Override
	public void updateBalance(String accountNumber,float balance)
	{
		String sql = "update accounts set initialbalance='"+balance+"'"+"where accountnumber='"+accountNumber+"'";
		jdbcTemplate.update(sql);
	}
}
