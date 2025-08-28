package com.wipro.productapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.productapp2.entity.Order;
import com.wipro.productapp2.service.PurchaseService;

@RestController
@RequestMapping("/orders")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/{productId}/{qty}")
    public ResponseEntity<Order> placeOrder(@PathVariable String productId, @PathVariable int qty) {
        try {
            Order order = purchaseService.placeOrder(productId, qty);
            return ResponseEntity.ok(order); 
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllOrders() {
        return ResponseEntity.ok(purchaseService.getAllOrders());
    }
}
