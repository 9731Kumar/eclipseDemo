package com.todo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.services.TodoServices;

@RestController
@CrossOrigin
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoServices todoServices;
	
	@GetMapping("/login/{username}/{password}/{role}")
	public boolean checkLogin(@PathVariable String username,@PathVariable String password,@PathVariable String role ) {
		System.out.println("Changed");
		return todoServices.checkLoginCredentials(username, password, role);
	}
	
	

}
