package com.deliveryboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class DeliverybodyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliverybodyApplication.class, args);
	}

}
