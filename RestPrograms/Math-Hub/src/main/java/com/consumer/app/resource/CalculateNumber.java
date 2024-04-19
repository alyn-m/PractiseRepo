package com.consumer.app.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.consumer.app.service.CallDifferentRestServices;
import com.consumer.app.service.ServiceUriProvider;

@Component
public class CalculateNumber implements CommandLineRunner {
	
	@Autowired
	private CallDifferentRestServices callRestService;
		
	public void run(String...strings) {
		System.out.println("Calling Addition Service");
		float addRes = callRestService.callAdditionService();
		if(addRes != 0 && addRes==30) {
			// call Sub service
			System.out.println("Calling Substraction service");
			float res = callRestService.callSubstractionService();
			System.out.println("Result of Sub Service:"+res);
		}
		if(addRes != 0 && addRes==40) {
			// Call Mul Service
			System.out.println("Calling Multiplication Service");
			float res = callRestService.callMultiplicationService();
			System.out.println("Result of Mul Service:"+res);
		}
		
	}
}
