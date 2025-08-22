package com.wipro.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.productapp.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

}
