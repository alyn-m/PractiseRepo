package com.consumer.app.resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumer.app.model.PaymentDetails;

@RestController
public class GetPaymentDetailsController implements CommandLineRunner{
	
	@Override
	public void run(String ...strings) {
		String url = "http://localhost:8082/producer/v2/paymentDetails?instrId=123444";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<PaymentDetails> resEntity
		= restTemplate.exchange(url, HttpMethod.POST, null, PaymentDetails.class);
		
		System.out.println(resEntity.getBody());
	}
	
}
