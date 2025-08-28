package com.wipro.productapp2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productapp2.entity.Product;
import com.wipro.productapp2.repo.ProductRepo;
import com.wipro.productapp2.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Optional<Product> existing = productRepo.findById(id);
        if (existing.isPresent()) {
            product.setId(id);
            return productRepo.save(product);
        }
        return null;
    }

    @Override
    public void deleteProduct(String id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
        }
    }
}
