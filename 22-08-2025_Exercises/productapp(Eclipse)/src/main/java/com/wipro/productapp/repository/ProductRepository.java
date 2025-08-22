package com.wipro.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.productapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
