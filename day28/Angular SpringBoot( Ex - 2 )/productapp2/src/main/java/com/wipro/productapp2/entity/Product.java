package com.wipro.productapp2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_details")
public class Product {

    @Id
    private String id;

    private String name;
    private String category;
    private Double price;
    private int qty;
    
    public Product() {};
    
    

    public Product(String name, String category, Double price, int qty) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.qty = qty;
	}



	public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Integer getQty() { return qty; }
    public void setQty(Integer qty) { this.qty = qty; }
}
