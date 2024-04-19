package com.multiplication.service.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate/v1")
public class MultiplicationResource {
	
	@GetMapping("/mul")
	public float calculateMultiplication(@RequestParam float num1, @RequestParam float num2) {
		return num1*num2;
	}
	
}
