package com.preetam.restfulwebservicesv3.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class HardCodedService {
	public static List<Todo> todos=new ArrayList<>();
	public static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"sneha","Learn kafka",new Date(),false));
		todos.add(new Todo(++idCounter,"preetam","whom to spring boot",new Date(),false));
		todos.add(new Todo(++idCounter,"pratiksha","learn microservices",new Date(),false));
	}
	public List<Todo>findAll(){
		return todos;
	}
public Todo deletebyId(long id) {
	Todo todo=findById(id);
	
	if(todo==null)return null;
	if(todos.remove(todo)) {
	return todo;
	}
	return null;
}
public Todo save(Todo todo) {
	if(todo.getId()==-1 || todo.getId()==0) {
		todo.setId(++idCounter);
		todos.add(todo);
	} else {
		deletebyId(todo.getId());
		todos.add(todo);
	}
	return todo;
}
public Todo findById(long id) {
	for(Todo todo:todos) {
		if(todo.getId()==id) {
			return todo;
		}
	}
	return null;
}
}
