package com.ecommerce.productService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.productService.entity.Product;
import com.ecommerce.productService.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

	private ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public Product getById(Integer id) {
		return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

}
