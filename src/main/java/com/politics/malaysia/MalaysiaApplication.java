package com.politics.malaysia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.politics.malaysia.configuration.BaseConfiguration;
import com.politics.malaysia.seeders.DataSeeder;

@SpringBootApplication()
@ComponentScan(basePackages = { "com.politics.malaysia.controller", "com.politics.malaysia.repositories", "com.politics.malaysia.services", "com.politics.malaysia.seeders" })
@EnableJpaRepositories(basePackages = { "com.politics.malaysia.repositories","com.politics.malaysia.entity" })
@EntityScan(basePackages = { "com.politics.malaysia.entity" })
@Import(BaseConfiguration.class)
public class MalaysiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MalaysiaApplication.class, args);
	}

	@Autowired
  private DataSeeder dataSeeder;

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> dataSeeder.seedData();
  }

}
