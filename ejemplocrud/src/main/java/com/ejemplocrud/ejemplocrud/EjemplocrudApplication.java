package com.ejemplocrud.ejemplocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class EjemplocrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplocrudApplication.class, args);
	}

}
