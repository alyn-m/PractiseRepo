package com.post.consumer.app.resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.post.consumer.app.model.HotelDetails;

@RestController
public class GetHotalDetails implements CommandLineRunner {
	
	public void run(String...strings) {
		String url = "http://localhost:8082/oyo/v2/getdetails?HotalName=ZamZam";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<HotelDetails> resEntity = 
		restTemplate.postForEntity(url, null, HotelDetails.class);
		
		System.out.println(resEntity.getBody().toString());
	}
	
}
