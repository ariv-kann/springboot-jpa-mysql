package com.example.springjpah2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="com.example.springjpah2demo.repo")
@SpringBootApplication
public class SpringJpaH2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaH2DemoApplication.class, args);
	}
}
