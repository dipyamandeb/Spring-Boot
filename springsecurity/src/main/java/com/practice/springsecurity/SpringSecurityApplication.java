package com.practice.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.practice.springsecurity")
@EnableJpaRepositories(basePackages = "com.practice.springsecurity.repository")
@EntityScan(basePackages = "com.practice.springsecurity.entity")
public class SpringSecurityApplication {

	//Commit eclipse test
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
}
