package com.ahmetfatih.services;

import java.util.List;

import com.ahmetfatih.dto.DtoTodo;
import com.ahmetfatih.dto.DtoTodoIU;


public interface ITodosService {
	
	public List<DtoTodo> getallTodo();
	
	public DtoTodo getByIdTodo(Integer id);
	
	public DtoTodo saveTodo(DtoTodoIU dtoTodoIU);

	public void deleteTodo(Integer id);
	
	public DtoTodo updateTodo(Integer id, DtoTodoIU dtoTodoIU);
	

}
