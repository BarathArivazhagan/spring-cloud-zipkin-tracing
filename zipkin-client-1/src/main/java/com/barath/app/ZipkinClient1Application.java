package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.barath.app.logger.AMCLogger;
import com.barath.app.logger.AMCLoggerFactory;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
public class ZipkinClient1Application {
	
	private static final AMCLogger logger=AMCLoggerFactory.getLogger();

	public static void main(String[] args) {
		logger.info("INFORMATION IS WEALTH  ======>");
		SpringApplication.run(ZipkinClient1Application.class, args);
	}
	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
	
	@Configuration
	@EnableSwagger2
	public class SwaggerConfiguration{
	
		@Bean
		public Docket docker(){
			return new Docket(DocumentationType.SWAGGER_2).select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build();
		}
			

	}
}