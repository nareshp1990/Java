package com.example.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDataMultipleDatasourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMultipleDatasourcesApplication.class, args);
	}
}
