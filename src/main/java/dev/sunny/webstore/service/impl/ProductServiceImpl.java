package dev.sunny.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sunny.webstore.domain.Product;
import dev.sunny.webstore.domain.repository.ProductRepository;
import dev.sunny.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void updateAllStock() {
		List<Product> allProducts = productRepository.getAllProducts();

		allProducts.stream()
			.filter(product -> product.getUnitsInStock() < 500)
			.forEach(product -> productRepository.updateStock(product.getProductId(), product.getUnitsInStock() + 1000));
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductByCategory(category);
	}
	
}
