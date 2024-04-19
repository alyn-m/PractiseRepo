package com.consumer.app.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CalculatorResource implements CommandLineRunner {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String addUrl = "http://localhost:8082/calculate/v1/add?num1=10&num2=20";
		String mulUrl = "http://localhost:8082/calculate/v1/mul?num1=10&num2=20";
		
		HttpEntity<String> httpEntity;
		ResponseEntity<Integer> responseEntity=
		restTemplate.exchange(addUrl, HttpMethod.GET, null, Integer.class);
		
		Integer result = webClientBuilder.build()
		.get()
		.uri(mulUrl)
		.retrieve()
		.bodyToMono(Integer.class)
		.block();
		/*
		 *   build, HttpMethod, url, Retrieve, Response object, block(get the response)
		 */
		
		WebClient webClient =  WebClient.create("url");
		WebClient webClient1 = WebClient.builder().build();
		
		RestClient restClient = RestClient.create(mulUrl);
		
		System.out.println("Addition Result: "+responseEntity.getBody());
		System.out.println("Multiplication Result: "+result);
	}
	
}
