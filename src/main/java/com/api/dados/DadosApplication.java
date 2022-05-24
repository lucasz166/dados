package com.api.dados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DadosApplication.class, args);
	}

	@GetMapping("/")
	public String index(){ return "TESTE"; }
}
