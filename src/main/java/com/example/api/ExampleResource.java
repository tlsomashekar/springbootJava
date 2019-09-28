package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleResource {

	@GetMapping("/say")
	public String helloWorld() {
		return "Hello World";
	}

}
