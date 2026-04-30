package com.ecommerce.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.productService.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
