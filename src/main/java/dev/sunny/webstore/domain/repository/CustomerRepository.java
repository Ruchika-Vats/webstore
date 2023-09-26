package dev.sunny.webstore.domain.repository;

import java.util.List;

import dev.sunny.webstore.domain.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
}
