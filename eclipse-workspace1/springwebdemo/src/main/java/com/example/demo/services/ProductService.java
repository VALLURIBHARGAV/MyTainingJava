package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository respository;
	public Product getProductById(int prdId) {
		Product prd = respository.findById(prdId).get();
		return prd;
	}
	
	public Iterable<Product> getAllProducts() {
		Iterable<Product>  products = respository.findAll();
		return products;
	}
	
	public String saveProduct(Product prd) {
		 respository.save(prd);
		 return "Product Saved";
	}
}

