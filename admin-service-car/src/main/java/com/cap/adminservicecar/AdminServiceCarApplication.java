package com.cap.adminservicecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class AdminServiceCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceCarApplication.class, args);
	}

}
