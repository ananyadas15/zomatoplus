package com.thinkxfactor.zomatoplus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //starting point
@ComponentScan("com.thinkxfactor") //scans for all the components (beans) of a given package
@EnableJpaRepositories(basePackages = "com.thinkxfactor") 
@EntityScan("com.thinkxfactor")  //looks for all objects and classes which have @entity
public class ZomatoplusApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZomatoplusApplication.class);
	}
	
	
}
