package com.wipro.productmngt.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productmngt.entity.ProductData;


@Repository
public interface ProductRepo extends JpaRepository<ProductData, Integer> {

	List<ProductData> findByProductMake(String productMake);
	List<ProductData> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
	Page<ProductData>  findAll(Pageable p); 
}
