package dev.sunny.webstore.service;

import java.util.List;

import dev.sunny.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	void updateAllStock();
	List<Product> getProductsByCategory(String category);
}
