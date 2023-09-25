package dev.sunny.webstore.domain.repository;

import java.util.List;

import dev.sunny.webstore.domain.Product;

@FunctionalInterface
public interface ProductRepository {
	List<Product> getAllProducts();
}
