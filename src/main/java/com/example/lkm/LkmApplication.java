package com.example.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LkmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LkmApplication.class, args);
	}

}
