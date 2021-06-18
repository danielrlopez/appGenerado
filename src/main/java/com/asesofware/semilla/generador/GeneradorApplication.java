package com.asesofware.semilla.generador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ConfigurationProperties
@PropertySource(value = {"classpath:application.properties","file:C://Users//Daniel Lopez//Documents//workspace//ejemplo 1//properties//application.properties"})
public class GeneradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneradorApplication.class, args);
	}

}
