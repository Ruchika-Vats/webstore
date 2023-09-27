package dev.sunny.webstore.domain.repository;

import java.util.List;

import dev.sunny.webstore.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	void updateStock(String productId, long noOfUnits);
	List<Product> getProductByCategory(String category);

}
