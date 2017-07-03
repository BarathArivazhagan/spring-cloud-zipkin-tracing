package com.barath.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barath.app.logger.AMCLogger;
import com.barath.app.logger.AMCLoggerFactory;

@RestController
public class AppController {
	
	private static final AMCLogger logger=AMCLoggerFactory.getLogger();
	
	@Autowired
	private ZipkinClient client;
	
	@GetMapping(value="/")
	public String home(){
		logger.info("Welcome Home from Client 1 is called ");
		return "Welcome from Client 1";
	}
	
	@GetMapping(value="/client")
	public String clientHome(){
		logger.info("Welcome Home from Client 2 is called ");
		return client.home();
	}

}
