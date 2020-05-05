package com.bicyclerentals.legendarycycles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LegendaryBicyclesInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegendaryBicyclesInfoApplication.class, args);
	}

}
