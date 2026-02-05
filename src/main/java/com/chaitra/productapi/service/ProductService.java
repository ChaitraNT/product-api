package com.chaitra.productapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chaitra.productapi.model.Product;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<>();
	
	public Product add(Product product) {
		products.add(product);
		return product;
	}
	
	public Product getById(int id) {
		for(Product p: products) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
}
