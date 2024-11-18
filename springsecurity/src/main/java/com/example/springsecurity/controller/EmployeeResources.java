package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResources {

	@GetMapping("/")
	public String Greet() {
		return "working";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin@work";
	}
	@GetMapping("/user")
	public String greetUser() {
		return "User@work";
	}
	
}
