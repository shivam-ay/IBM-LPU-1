package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService 
{
	
	private ToDoRepository toDoRepository;

	@Autowired
	public ToDoServiceImpl(ToDoRepository toDoRepository) 
	{
		super();
		this.toDoRepository = toDoRepository;
	}

	public ToDo createToDo(ToDo todo) 
	{
		
		return toDoRepository.createToDo(todo);
	}
	public void updateTodo(String id,String name)
	{
		toDoRepository.updateTodo(id, name);
	}
	public void displayAll()
	{
		toDoRepository.displayAll();
	}
}