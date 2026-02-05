package com.chaitra.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitra.productapi.model.Product;
import com.chaitra.productapi.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@PostMapping
	public Object addProduct(@RequestBody Product product) {
		if(product.getName() == null || product.getName().isEmpty()) {
			return "Product name is required";
		}
		
		if(product.getPrice() <= 0) {
			return "Price must be greater than zero";
		}
		
		return service.add(product);
	}
	
	@GetMapping("/{id}")
	public Object getProduct(@PathVariable int id) {
		
		Product result = service.getById(id);
		if(result == null) {
			return "Product not found";
		}
		return result;
	}
}
