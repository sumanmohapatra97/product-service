package com.ecommerce.productService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productService.entity.Product;
import com.ecommerce.productService.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAll();
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return productService.getById(id);
	}

	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.save(product);
	}
}
