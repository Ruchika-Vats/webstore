package dev.sunny.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.sunny.webstore.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public String listProducts(Model model) {
		Product iPhone = new Product("P1234", "iPhone XR", new BigDecimal(499));
		iPhone.setDescription("Apple iPhone XR smartphone with 6.1-inch display and 8-megapixel rear camera. This iPhone supports iOS 17 update.");
		iPhone.setCategory("Smartphone");
		iPhone.setManufacturer("Apple");
		iPhone.setUnitsInStock(1000);
		
		model.addAttribute("product", iPhone);
		return "products";
	}
}
