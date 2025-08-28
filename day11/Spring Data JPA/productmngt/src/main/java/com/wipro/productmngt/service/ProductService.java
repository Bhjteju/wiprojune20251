package com.wipro.productmngt.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.productmngt.entity.ProductData;

public interface ProductService {
	
	void save(ProductData productData);
	List<ProductData> findAll();
	ProductData findById(int id);
	void deleteById(int id);
	List<ProductData> findByProductMake(String productMake);
	List<ProductData> getByNameAndMakeSorted(String name, String make);
	
	Page<ProductData> findAll(Pageable p); 
}
