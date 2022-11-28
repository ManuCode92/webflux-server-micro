package com.nttdata.bootcamp.webfluxservermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxServerMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxServerMicroApplication.class, args);
		System.out.println("Servidor en el puerto 9880");
	}

}
