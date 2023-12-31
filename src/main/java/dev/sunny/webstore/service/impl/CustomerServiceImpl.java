package dev.sunny.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sunny.webstore.domain.Customer;
import dev.sunny.webstore.domain.repository.CustomerRepository;
import dev.sunny.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
	
}
