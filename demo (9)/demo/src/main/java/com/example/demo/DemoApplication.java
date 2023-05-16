package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerPaymentMethod;
import com.example.demo.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// 1
		//CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
		//customerRepository.createCustomer(new Customer(0, "tomer", "avivi", "tomeravivi@gmail.com"));
	}

	// 2
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			//repository.save(new Book(null, "Spring boot in Action", 471, "Craig Walls"));
			customerRepository.createCustomer(new Customer(0, "tomer", "avivi", "tomeravivi@gmail.com", CustomerPaymentMethod.CASH));
		};
	}

}
