package com.barath.app;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class AppController {
	
	private static final Logger logger=LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private Client2 client;

	private RestTemplate restTemplate;

	@Value("${microservice.client.url}")
	private String clientUrl;


	public AppController(Client2 client,RestTemplate restTemplate) {
		this.client=client;
		this.restTemplate=restTemplate;
	}

	@GetMapping(value="/")
	public String home(){
		logger.info("Welcome Home from Client 1 is called ");
		return "Welcome from Client 1";
	}
	
	@GetMapping(value="/client")
	public String clientHome(){
		logger.info("Invoke Client 1 from Client 2 is called ");
		return client.home();
	}

	@GetMapping(value = "/rest/client2")
	public String client2ThroughREST(){
		logger.info("Invoke Client 1 from Client 2 is called ");
		ResponseEntity<String> responseEntity=restTemplate.getForEntity(clientUrl,String.class);
		return responseEntity.getBody();
	}

}
