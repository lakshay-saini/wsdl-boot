package com.decipher.wsdlboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WsdlBootApplication {

	private String value;

	public static void main(String[] args) {
		SpringApplication.run(WsdlBootApplication.class, args);
	}

	@Bean
	public String lookup(DataClient quoteClient) {
		this.value =  quoteClient.getGreetMessage().getReturn();
		return this.value;
	}

	@RequestMapping("/")
	public String getMessage() {
		return value;
	}
}
