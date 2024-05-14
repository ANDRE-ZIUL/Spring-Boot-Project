package br.edu.univas.customer.util;

import org.springframework.stereotype.Component;
import br.edu.univas.customer.dtos.CustomerDTO;
import br.edu.univas.customer.entities.CustomerEntity;

@Component
public class CustomerEntityConverter {
	public static CustomerDTO toDTO(CustomerEntity customer) {
		return new CustomerDTO(
				customer.getId(), customer.getDocumentNumber(), customer.getName(),
				customer.getEmail(), customer.getPhoneNumber(), customer.getType());
	}

	public CustomerEntity toEntity(CustomerDTO customer) {
		return new CustomerEntity(
				customer.getId(), customer.getDocumentNumber(), customer.getName(),
				customer.getEmail(), customer.getPhoneNumber(), customer.getType());
	}
}
