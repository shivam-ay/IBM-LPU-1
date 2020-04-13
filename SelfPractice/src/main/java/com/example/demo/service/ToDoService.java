package com.example.demo.service;

import com.example.demo.bean.ToDo;

public interface ToDoService 
{
	public ToDo createToDo(ToDo todo);
	public void updateTodo(String id,String name);
	public void displayAll();
}
