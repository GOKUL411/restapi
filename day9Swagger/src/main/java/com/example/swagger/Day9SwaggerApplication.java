package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "User App",
				version = "1.1.2",
				description = "sample program",
				contact = @Contact(
						name = "gokul",
						email = "abc@gmail.com"
						)
				)
		)

public class Day9SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day9SwaggerApplication.class, args);
	}

}
