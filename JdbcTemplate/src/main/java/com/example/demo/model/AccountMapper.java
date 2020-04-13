package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountMapper implements RowMapper<Account>
{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Account account = new Account();
		account.setAccountNumber(rs.getString("accountnumber"));
		account.setAccountType(rs.getString("accounttype"));
		account.setInitialBalance(rs.getFloat("initialbalance"));
		return account;
	}
}
