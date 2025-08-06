package com.ahmetfatih.services.impl;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmetfatih.dto.DtoTodo;
import com.ahmetfatih.dto.DtoTodoIU;
import com.ahmetfatih.entities.Todo;
import com.ahmetfatih.repository.TodosRepository;
import com.ahmetfatih.services.ITodosService;


@Service
public class TodosServiceImpl implements ITodosService{
	
	@Autowired
	private TodosRepository todosRepository;

	@Override
	public List<DtoTodo> getallTodo() {
		
		List<DtoTodo> tododtoList = new ArrayList<>();
		List<Todo> todoList	= todosRepository.findAll();
		for (Todo todo : todoList) {
			DtoTodo dtoTodo = new DtoTodo();
			BeanUtils.copyProperties(todo, dtoTodo);
			tododtoList.add(dtoTodo);
			
		}
				
		return tododtoList;
	}

	@Override
	public DtoTodo saveTodo(DtoTodoIU dtoTodoIU) {

		Todo todo = new Todo();
		if(dtoTodoIU != null) {
			
		DtoTodo dtoTodo = new DtoTodo();
		BeanUtils.copyProperties(dtoTodoIU, todo);
		Todo dbTodo = todosRepository.save(todo);
		BeanUtils.copyProperties(dbTodo, dtoTodo);
		return dtoTodo;
		}
		
		return null;
	}

	@Override
	public DtoTodo getByIdTodo(Integer id) {

		
		Optional<Todo> optional = todosRepository.findById(id);
		
		if(optional.isPresent()) {
		
			Todo todo = optional.get();
			DtoTodo dtoTodo = new DtoTodo();
			BeanUtils.copyProperties(todo, dtoTodo);
			return dtoTodo;
		}
		
		return null;
	}

	@Override
	public void deleteTodo(Integer id) {
		
		Optional<Todo> optional = todosRepository.findById(id);
		if(optional.isPresent()) {
			todosRepository.delete(optional.get());
		}
		
	}

	@Override
	public DtoTodo updateTodo(Integer id, DtoTodoIU dtoTodoIU) {
		
		Optional<Todo> optional = todosRepository.findById(id);
		if(optional.isPresent()) {
			
			deleteTodo(id);
			DtoTodo dtoTodo = saveTodo(dtoTodoIU);
			return dtoTodo;
			
		}
		return null;
	}
	
	
	
	
	

}
