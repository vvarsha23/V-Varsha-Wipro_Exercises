package com.wipro.productmanagement.controller;
import com.wipro.productmanagement.entity.Product;
import com.wipro.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	 @Autowired
	    private ProductService productService;

	    @PostMapping
	    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
	        return ResponseEntity.ok(productService.saveProduct(product));
	    }

	    @GetMapping
	    public ResponseEntity<List<Product>> getAllProducts() {
	        return ResponseEntity.ok(productService.getAllProducts());
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable int id) {
	        return productService.getProductById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
	        return productService.getProductById(id).map(existingProduct -> {
	            product.setId(id);
	            return ResponseEntity.ok(productService.updateProduct(product));
	        }).orElse(ResponseEntity.notFound().build());
	    }
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
	        productService.deleteProduct(id);
	        return ResponseEntity.noContent().build();
	    }

}
