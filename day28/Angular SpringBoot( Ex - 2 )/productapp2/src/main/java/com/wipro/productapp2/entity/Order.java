package com.wipro.productapp2.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;  
    private String productName;
    private int qty;          
    private int qtyPurchased; 
    private LocalDateTime orderDate;

    public Order() {}
  
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    public int getQtyPurchased() { return qtyPurchased; }
    public void setQtyPurchased(int qtyPurchased) { this.qtyPurchased = qtyPurchased; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
}
