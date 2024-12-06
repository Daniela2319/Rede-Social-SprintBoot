package com.edu.redes.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.edu.redes.social"})
public class RedesSocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedesSocialApplication.class, args);
	}

}
