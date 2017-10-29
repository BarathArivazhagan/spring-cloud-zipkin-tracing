package com.barath.app;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
	
	private static final Logger logger=LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Autowired
	private ZipkinClient client;
	
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
	public String client2REST(){

	}

}
