package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;


@SpringBootApplication
public class MyFirstProjectApplication {
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(MyFirstProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}
}
