package com.consumer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersUriSpec;

import com.consumer.app.configuration.UrlConstants;

@Component
public class CallDifferentRestServices {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ServiceUriProvider uriProvider;
	
	public float callAdditionService(){
		
		String uri = uriProvider.getAdditionServiceUri();
		String url = uri+UrlConstants.BASE_URL+UrlConstants.ADD_ENDPOINT+"?num1=10&num2=20";
		
		ResponseEntity<Float> resEnt 
		= restTemplate.exchange(url, HttpMethod.GET, null, Float.class);
		
		return resEnt.getBody();
	}
	public float callSubstractionService() {
		
		// get url
		String url = 
				uriProvider.getSubstractionServiceUri()+UrlConstants.BASE_URL+UrlConstants.SUB_ENDPOINT+"?num1=100&num2=20";
		
		ResponseEntity<Float> resEntity
		= restTemplate.exchange(url, HttpMethod.GET, null, Float.class);
		
		return resEntity.getBody();
	}
	
	public float callMultiplicationService() {
		WebClient webClient = WebClient.create(uriProvider.getSubstractionServiceUri());
		
		float res = webClient.get()
		.uri(UrlConstants.BASE_URL+UrlConstants.MUL_ENDPOINT+"?num1=10&num2=10")
		.retrieve()
		.bodyToMono(Float.class)
		.block();
		
		return res;
		
	}
}	

