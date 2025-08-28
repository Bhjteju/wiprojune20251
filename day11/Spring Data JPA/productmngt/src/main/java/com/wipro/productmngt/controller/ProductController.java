package com.wipro.productmngt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmngt.entity.ProductData;
import com.wipro.productmngt.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/productdata")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Tag(name = "Tutorial", description = "Tutorial management APIs")
	 
	@Operation(summary = "Save a product data")
		  @ApiResponses(value = {
		    @ApiResponse(responseCode = "200", description = "Saved successfully"),
		    @ApiResponse(responseCode = "404", description = "Not found")
		  })
	 
	
	@PostMapping
	void save(@RequestBody ProductData productData)
	{
		productService.save(productData);
	}
	
	@GetMapping
	List<ProductData> findAll()
	{
		return productService.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	ProductData findById(@PathVariable int id)
	{
		return productService.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody ProductData productData)
	{
		productService.save(productData);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productService.deleteById(id);
		
	}
	
	@GetMapping("/type")
	List<ProductData> findByProductMake(@RequestParam String productMake)
	{
		return productService.findByProductMake(productMake);
		
	}
	@GetMapping("/typepath/{path}")
	List<ProductData> findByProductMakePath(@PathVariable String path)
	{
		return productService.findByProductMake(path);
	}
	
	@GetMapping("/typepath/{name}/{make}")
	public List<ProductData> getByNameAndMake(@PathVariable String name, @PathVariable String make) {
        return productService.getByNameAndMakeSorted(name, make);
    }
	
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	public Page<ProductData> findAllPage(@PathVariable int pageNum,
	                                     @PathVariable int pageSize,
	                                     @PathVariable int sortOrder) {
	    Pageable p;
	    if (sortOrder == 0) {
	        p = PageRequest.of(pageNum, pageSize, Sort.by("productName").descending());
	    } else {
	        p = PageRequest.of(pageNum, pageSize, Sort.by("productName").ascending());
	    }

	    return productService.findAll(p);
	}

}
