package dev.sunny.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.sunny.webstore.service.ProductService;

@Controller
@RequestMapping(value = "market")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public String listProducts(Model model) {
		
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@RequestMapping(value = "/update/stock")
	public String updateStock(Model model) {
		productService.updateAllStock();
		return "redirect:/market/products";
	}
	
	@RequestMapping(value = "/products/{category}")
	public String getProductsByCategory(Model model, @PathVariable String category) {
		model.addAttribute("products", productService.getProductsByCategory(category));
		return "products";
	}
}
