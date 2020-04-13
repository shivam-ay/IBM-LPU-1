package com.example.demo.repo;

import com.example.demo.bean.ToDo;

public interface ToDoRepository 
{
	public ToDo createToDo(ToDo todo);
	public void updateTodo(String id,String name);
	public void displayAll();
}
