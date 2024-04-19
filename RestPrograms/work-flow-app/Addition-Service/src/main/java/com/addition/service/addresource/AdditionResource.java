package com.addition.service.addresource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate/v1")
public class AdditionResource {
	
	@GetMapping("/add")
	public Float addNumbers(@RequestParam Float num1, @RequestParam Float num2) {
		
		return num1+num2;
		
	}
	
}
