package com.wipro.productapp2.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productapp2.entity.Order;
import com.wipro.productapp2.entity.Product;
import com.wipro.productapp2.repo.OrderRepo;
import com.wipro.productapp2.repo.ProductRepo;
import com.wipro.productapp2.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order placeOrder(String productId, int qty) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (qty > product.getQty()) {
            throw new RuntimeException("Not enough stock available!");
        }

     
        product.setQty(product.getQty() - qty);
        productRepo.save(product);

  
        Order order = new Order();
        order.setProductId(product.getId());       
        order.setProductName(product.getName());    
        order.setQty(product.getQty());             
        order.setQtyPurchased(qty);                 
        order.setOrderDate(LocalDateTime.now());

        return orderRepo.save(order);              
    }


    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
