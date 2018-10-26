package com.decipher.wsdlboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsdlBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsdlBootApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(DataClient quoteClient) {
		return args -> {

			String response = quoteClient.getMessage().getReturn();
			System.err.println(response);
		};
	}

}
