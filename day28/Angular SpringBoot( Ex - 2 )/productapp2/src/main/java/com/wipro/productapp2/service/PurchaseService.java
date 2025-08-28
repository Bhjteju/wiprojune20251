package com.wipro.productapp2.service;

import com.wipro.productapp2.entity.Order;
import java.util.List;

public interface PurchaseService {
    Order placeOrder(String productId, int qty); 
    List<Order> getAllOrders();
}
