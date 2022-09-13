package com.helloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String display() {
		return "Hello every one, This is Dinesh Jadhav from Pune !";
	}
}
