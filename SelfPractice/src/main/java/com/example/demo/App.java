package com.example.demo;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.ToDo;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

public class App 
{
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		ToDo todo=context.getBean("toDo",ToDo.class);
		todo.setTodoID(UUID.randomUUID().toString());
		todo.setTodoName("testing");
		//todo=service.createToDo(todo);
		//System.out.println(todo);
		service.updateTodo("24faf985-60da-4367-ba18-896bc2b018d6", "sting");
		service.displayAll();
    }
}
