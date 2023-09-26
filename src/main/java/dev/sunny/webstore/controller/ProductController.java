package dev.sunny.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.sunny.webstore.domain.repository.ProductRepository;
import dev.sunny.webstore.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public String listProducts(Model model) {
		
		model.addAttribute("products", productRepository.getAllProducts());
		return "products";
	}
	
	@RequestMapping(value = "/update/stock")
	public String updateStock(Model model) {
		productService.updateAllStock();
		return "redirect:/products";
	}
}
