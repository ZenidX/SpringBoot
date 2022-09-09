package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyFirstProjectApplication {
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(MyFirstProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		LOGGER.info("An INFO Message");
		LOGGER.warn("A WARN Message");
		LOGGER.error("A ERROR Message");
		LOGGER.debug("A DEBUG Message");
		LOGGER.trace("A TRACE Message");
	}
}
