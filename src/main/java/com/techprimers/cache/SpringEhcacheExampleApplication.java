package com.techprimers.cache;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.techprimers.cache.model.Users;
import com.techprimers.cache.repository.UsersRepository;

@SpringBootApplication
public class SpringEhcacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEhcacheExampleApplication.class, args);
	}
		
}
