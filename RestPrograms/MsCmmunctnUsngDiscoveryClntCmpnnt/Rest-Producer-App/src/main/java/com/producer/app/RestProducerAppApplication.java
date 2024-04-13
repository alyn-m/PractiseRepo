package com.producer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProducerAppApplication.class, args);
	}

}
