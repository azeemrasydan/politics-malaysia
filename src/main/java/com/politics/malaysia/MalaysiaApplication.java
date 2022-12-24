package com.politics.malaysia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.politics.malaysia.configuration.BaseConfiguration;

@SpringBootApplication()
@ComponentScan(basePackages = { "com.politics.malaysia.controller", "com.politics.malaysia.repositories", "com.politics.malaysia.services" })
@EnableJpaRepositories(basePackages = { "com.politics.malaysia.repositories","com.politics.malaysia.entity" })
@EntityScan(basePackages = { "com.politics.malaysia.entity" })
@Import(BaseConfiguration.class)
public class MalaysiaApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MalaysiaApplication.class, args);
	}

}
