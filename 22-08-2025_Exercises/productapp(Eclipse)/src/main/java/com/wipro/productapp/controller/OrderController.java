package com.wipro.productapp.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.productapp.model.ProductOrder;
import com.wipro.productapp.repository.ProductOrderRepository;
import com.wipro.productapp.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrderController {
	private final ProductRepository productRepo;
    private final ProductOrderRepository orderRepo;

    public OrderController(ProductRepository productRepo, ProductOrderRepository orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestParam Long productId, @RequestParam int qty) {
        return productRepo.findById(productId).map(product -> {
            if (qty > product.getQty()) {
                return ResponseEntity.badRequest().body("Not enough stock");
            }
            product.setQty(product.getQty() - qty);
            productRepo.save(product);

            ProductOrder order = new ProductOrder();
            order.setProductName(product.getName());
            order.setQtyPurchased(qty);
            order.setOrderDate(LocalDateTime.now());
            orderRepo.save(order);

            return ResponseEntity.ok("Order placed successfully");
        }).orElse(ResponseEntity.badRequest().body("Product not found"));
    }

    @GetMapping
    public List<ProductOrder> getAllOrders() {
        return orderRepo.findAll();
    }

}
