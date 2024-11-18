package com.example.identityservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/A")
public class Controller {
	
	@GetMapping("/helloA")
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("Hello world from A");
	}
	

}
