package com.example.bootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerExampleController {

	@GetMapping("/greet")
	public String message() {
		return "Ola! Como Sava";
	}
}
