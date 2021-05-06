package com.kazale.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PontoInteligente2Application {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligente2Application.class, args);
	}

}
