package com.ahmetfatih.controller;

import java.util.List;

import com.ahmetfatih.dto.DtoTodo;
import com.ahmetfatih.dto.DtoTodoIU;


public interface ITodosController {
	
	public List<DtoTodo> getAllTodo();
	
	public DtoTodo getByIdTodo(Integer id);
	
	public DtoTodo saveTodo(DtoTodoIU dtoTodoIU);
	
	public void deleteTodo(Integer id);
	
	public DtoTodo updateTodo(Integer id, DtoTodoIU dtoTodoIU);
	
}
