package com.javatechie.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/deploy")
	public String test() {
		return "Finally deployed";
	}
	
}
