package com.Wchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WchallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WchallengeApplication.class, args);
	}

}
