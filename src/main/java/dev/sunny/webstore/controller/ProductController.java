package dev.sunny.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.sunny.webstore.domain.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public String listProducts(Model model) {
		
		model.addAttribute("products", productRepository.getAllProducts());
		return "products";
	}
}
