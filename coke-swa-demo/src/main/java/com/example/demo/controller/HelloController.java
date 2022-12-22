package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot App!!!";
	}
	
	
	
	@GetMapping("/hello1")
	public String sayHello1() {
		return "Hello Spring Boot App";
	}
	
	@GetMapping("/srilanka")
	public String sayHelloToSrilanka() {
		return "Hello Spring Boot App";
	}

}
