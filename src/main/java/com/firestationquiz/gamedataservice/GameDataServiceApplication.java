package com.firestationquiz.gamedataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GameDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameDataServiceApplication.class, args);
	}

}
