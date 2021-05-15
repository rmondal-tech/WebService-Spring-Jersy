package com.java.spring.jersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
4.7.3. JAX-RS and Jersey

If you prefer the JAX-RS programming model for REST endpoints, you can use one of the
available implementations instead of Spring MVC. Jersey and Apache CXF work quite well
 out of the box
*/
@SpringBootApplication
@EnableAutoConfiguration
public class JerseyRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyRestServiceApplication.class, args);
	}

}

