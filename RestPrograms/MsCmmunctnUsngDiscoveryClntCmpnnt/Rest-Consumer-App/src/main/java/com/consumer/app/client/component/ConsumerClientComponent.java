package com.consumer.app.client.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

@Component
public class ConsumerClientComponent {
	
	@Autowired
	private DiscoveryClient clientComponent;
	
	public ServiceInstance getServiceInstance() {
		
		List<ServiceInstance> producerInstanceList = 
				clientComponent.getInstances("Rest-Producer-App");
		
		return producerInstanceList.get(0);	
	}
	
}
