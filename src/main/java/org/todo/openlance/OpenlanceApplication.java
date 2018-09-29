package org.todo.openlance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.todo.openlance.controller.TaskController;

@SpringBootApplication
public class OpenlanceApplication {
 //start point
	//private TaskController taskController = new TaskController();
	public static void main(String[] args) {

		SpringApplication.run(OpenlanceApplication.class, args);
	}
}
