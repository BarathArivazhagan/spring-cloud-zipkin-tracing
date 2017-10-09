package com.barath.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	private static final Logger logger=LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private ZipkinClient client;
	
	@GetMapping(value="/")
	public String home(){
		logger.info("Welcome Home from Client 2 is called ");
		return "Welcome from Client 2";
	}
	
	@GetMapping(value="/client")
	public String clientHome(){
		logger.info("Welcome Home from Client 2 is called ");
		return client.home();
	}

}