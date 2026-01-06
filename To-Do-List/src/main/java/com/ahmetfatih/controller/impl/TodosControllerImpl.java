package com.ahmetfatih.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetfatih.controller.ITodosController;
import com.ahmetfatih.dto.DtoTodo;
import com.ahmetfatih.dto.DtoTodoIU;
import com.ahmetfatih.services.impl.TodosServiceImpl;



@RestController
@RequestMapping("/rest/api/todo")
@CrossOrigin(origins = "*")
public class TodosControllerImpl implements ITodosController {

	@Autowired
	private TodosServiceImpl todosServiceImpl;
	
	@GetMapping(path = "/list")
	@Override
	public List<DtoTodo> getAllTodo() {
		return todosServiceImpl.getallTodo();
	}

	@PostMapping(path = "/save")
	@Override
	public DtoTodo saveTodo(@RequestBody DtoTodoIU dtoTodoIU) {
		return todosServiceImpl.saveTodo(dtoTodoIU);
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public DtoTodo getByIdTodo(@PathVariable(name = "id",required = true) Integer id) {

		return todosServiceImpl.getByIdTodo(id);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteTodo(@PathVariable(name = "id") Integer id) {
		
		todosServiceImpl.deleteTodo(id);
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public DtoTodo updateTodo(@PathVariable(name = "id") Integer id,@RequestBody DtoTodoIU dtoTodoIU) {
		return todosServiceImpl.updateTodo(id, dtoTodoIU);
	}
	
	
	
	
	

}
