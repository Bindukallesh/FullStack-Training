package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.model.MyUser;
import com.example.springsecurity.repository.UserRepository;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	@Autowired
	UserRepository repository;

	@PostMapping("add")
	public MyUser newUser(@RequestBody MyUser user) {
		return repository.save(user);
	}
}
