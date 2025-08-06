package com.ahmetfatih.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ahmetfatih"})
@EntityScan(basePackages = {"com.ahmetfatih"})
@EnableJpaRepositories(basePackages = {"com.ahmetfatih"})
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
