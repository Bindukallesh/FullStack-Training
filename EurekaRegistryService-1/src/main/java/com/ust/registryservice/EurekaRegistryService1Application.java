package com.ust.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryService1Application.class, args);
	}

}
