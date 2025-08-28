package com.wipro.productapp2.service;

import java.util.List;
import com.wipro.productapp2.entity.Product;

public interface ProductService {
	
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product saveProduct(Product product);
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
}
