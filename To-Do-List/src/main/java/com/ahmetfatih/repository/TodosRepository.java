package com.ahmetfatih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmetfatih.entities.Todo;

@Repository
public interface TodosRepository extends JpaRepository<Todo, Integer> {

}
