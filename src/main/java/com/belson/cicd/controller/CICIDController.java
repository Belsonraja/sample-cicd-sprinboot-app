package com.belson.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICIDController {

	@GetMapping(value = "/")
	public String greetings() {
		return "Hello! Welcome to my application";
	}
}
