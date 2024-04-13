package com.producer.app.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.producer.app.model.Request;
import com.producer.app.service.RequestValidatorService;

@RestController
@RequestMapping("/validator")
public class RequestValidatorResource {
	
	
	private RequestValidatorService reqValSrv = new RequestValidatorService();
	
	@PostMapping("/request/pacs008")
	public String validateRequest(@RequestBody Request req) {
		System.out.println(req.toString());
		return reqValSrv.validatePacs008Request(req);
	}
	
	@GetMapping("/request/pacs002")
	public String sentRequestType(@RequestParam String reqType) {
		return reqType;
	}
	
}
