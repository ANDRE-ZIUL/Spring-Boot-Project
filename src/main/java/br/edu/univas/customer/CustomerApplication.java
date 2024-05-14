package br.edu.univas.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.univas.customer.entities.CustomerEntity;
import br.edu.univas.customer.repositories.CustomerRepository;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<CustomerEntity> Customer = repo.findAll();
		System.out.println("API running in http://localhost:8080/api/customers");
	}
}
