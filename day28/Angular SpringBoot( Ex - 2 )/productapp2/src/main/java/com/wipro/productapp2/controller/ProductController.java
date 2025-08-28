package com.wipro.productapp2.controller;

import com.wipro.productapp2.entity.Product;
import com.wipro.productapp2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

   
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }
    
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        if (product.getQty() == 0) {
            product.setQty(0);
        }
        return productService.saveProduct(product);
    }
 
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}
