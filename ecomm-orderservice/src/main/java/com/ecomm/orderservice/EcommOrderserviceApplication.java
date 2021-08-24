package com.ecomm.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EcommOrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommOrderserviceApplication.class, args);
	}

}
