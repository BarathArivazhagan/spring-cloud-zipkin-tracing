package com.barath.app;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="client",url="${zipkin.client.url}")
public interface ZipkinClient {
	
	@GetMapping(value="/")
	public String home();

}
