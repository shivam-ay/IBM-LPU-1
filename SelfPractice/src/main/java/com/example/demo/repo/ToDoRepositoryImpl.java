package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.ToDo;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository
{
	private DataSource dataSource;
	@Autowired
	public ToDoRepositoryImpl(DataSource dataSource) throws SQLException 
	{
		super();
		logger.log(Level.INFO, "connecting to database");
		connection=dataSource.getConnection();
		logger.log(Level.INFO, "connected");
		this.dataSource = dataSource;
	}

	private Connection connection=null;
	
	private static Logger logger=Logger.getLogger("ToDoRepositoryImpl");

	public ToDo createToDo(ToDo todo) 
	{
		try
		{
			
			PreparedStatement pStatement=connection.prepareStatement("insert into todo value(?,?)");
			pStatement.setString(1, todo.getTodoID());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "todo creation completed");
		} 
		catch (Exception e)
		{
			logger.log(Level.SEVERE, "Can not connect to database");
			e.printStackTrace();
			
		}
			return todo;
	}
	
	public void updateTodo(String id,String name)
	{
		try
		{
			PreparedStatement ps = connection.prepareStatement("update todo set todoname=? where todoid=?");
			ps.setString(1, name);
			ps.setString(2, id);
			ps.executeUpdate();
			logger.log(Level.INFO,"Updated");
		} 
		catch (SQLException e)
		{
			logger.log(Level.INFO,"Exception");
			e.printStackTrace();
		}
	}
	public void displayAll()
	{
		try 
		{
			PreparedStatement ps = connection.prepareStatement("select * from todo");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.printf("ToDo id: %s ToDoName: %s", rs.getString(1),rs.getString("todoname"));
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
