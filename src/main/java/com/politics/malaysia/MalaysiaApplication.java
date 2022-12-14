package com.politics.malaysia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MalaysiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MalaysiaApplication.class, args);
	}

}
