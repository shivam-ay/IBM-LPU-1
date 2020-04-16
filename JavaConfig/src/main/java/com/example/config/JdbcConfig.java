package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:database.properties")
public class JdbcConfig 
{
	@Autowired
	Environment environment;
	
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://localhost:3306/logs");
//		dataSource.setPassword("rasengan");
//		dataSource.setUsername("root");
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setPassword(environment.getProperty("db.password"));
		dataSource.setUsername(environment.getProperty("db.user"));
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DriverManagerDataSource dataSource)
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
}
