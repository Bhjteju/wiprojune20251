package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dto.Mobile;
import com.wipro.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	MobileService service;
	
	@GetMapping
	public List<Mobile> getAllMobiles()
	{
		return service.showAllMobiles();
	}
	@PostMapping
	public void postMobile(@RequestBody Mobile mobile)
	{
		service.registerMobile(mobile);
	}
	@PutMapping
	public String putMobile(@RequestBody Mobile mobile)
	{
		return service.updateMobile(mobile);
	}
	@DeleteMapping
	public String deleteMobile(@RequestBody Mobile mobile)
	{
		return service.deleteMobile(mobile);
	}
}
