package com.politics.malaysia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication()
@EnableJpaRepositories("com.politics.malaysia.repository")
@EntityScan(basePackages = { "com.politics.malaysia.entity" })
public class MalaysiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MalaysiaApplication.class, args);
	}

}
