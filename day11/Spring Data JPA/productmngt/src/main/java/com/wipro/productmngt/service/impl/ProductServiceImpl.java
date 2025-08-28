package com.wipro.productmngt.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.productmngt.entity.ProductData;
import com.wipro.productmngt.repo.ProductRepo;
import com.wipro.productmngt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public void save(ProductData productData) {
		productRepo.save(productData);
		
	}

	@Override
	public List<ProductData> findAll() {
		
		return productRepo.findAll();
	}

	@Override
	public ProductData findById(int id) {
		
		Optional<ProductData> productData=productRepo.findById(id);
		if(!productData.isEmpty())
		{
			return productData.get();
		}
		return null;
		
	}

	@Override
	public void deleteById(int id) {
		
		productRepo.deleteById(id);
		
		
	}

	@Override
	public List<ProductData> findByProductMake(String productMake) {
		return productRepo.findByProductMake(productMake);
	}
	
//	public List<ProductData> getByNameAndMake(String name, String make) {
//        return productRepo.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
//    }

	@Override
	public List<ProductData> getByNameAndMakeSorted(String name, String make) {
		
		return productRepo.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
	}



	@Override
	public Page<ProductData> findAll(Pageable p) {
		
		return productRepo.findAll(p);
	}
	

}
