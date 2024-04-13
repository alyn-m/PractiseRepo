package com.consumer.app.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumer.app.client.component.ConsumerClientComponent;
import com.consumer.app.model.Request;

@RestController
public class ConsumerResource implements CommandLineRunner {
	
	@Autowired
	private ConsumerClientComponent clientComponent;

	@Override
	@GetMapping("/send/msg/pacs008")
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ServiceInstance prodServiceInstance = clientComponent.getServiceInstance();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$"+prodServiceInstance.getServiceId());
		
		  String producerUrl =
		  prodServiceInstance.getUri().toString()+"/validator/request/pacs002?reqType=pacs001";
		  
		  String producerPacs08Url = 
				  prodServiceInstance.getUri().toString()+"/validator/request/pacs008";
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$"+producerUrl);
		  
		  RestTemplate restTemplate = new RestTemplate();
	//	  ResponseEntity<String> resEntity= restTemplate.getForEntity(producerUrl, String.class);
		  
		  Request req = new Request();
		  req.setEndToEndId("65657ghvcf");
		  req.setInstrId("123456");
		  req.setDateTime("2023-01-06T00:08:14");
		  req.setMsgType("pacs.001");
		  
		  HttpEntity<Request> requestEntity = new HttpEntity<>(req);
		  
		  ResponseEntity<String> resEntity= restTemplate.exchange(producerPacs08Url, HttpMethod.POST, requestEntity, String.class);
		  
		  System.out.println("####################"+resEntity.getBody());
	}
	
}
