package com.ucla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class UclaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UclaApplication.class, args);
	}

}
