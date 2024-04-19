package com.consumer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class ServiceUriProvider {
	
	@Autowired
	private DiscoveryClient discClient;
	
	public String getAdditionServiceUri(){
		return discClient.getInstances("Addition-Service").get(0).getUri().toString();
	}
	
	public String getSubstractionServiceUri(){
		return discClient.getInstances("Substraction-Service").get(0).getUri().toString();
	}
	
	public String getMultiplicationServiceUri(){
		return discClient.getInstances("Multiplication-Service").get(0).getUri().toString();
	}
	
}
