package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dto.Mobile;
import com.wipro.repo.MobileRepo;

@Service
public class MobileService implements MobileInterface {

	@Autowired
	MobileRepo repo;
	@Override
	public void registerMobile(Mobile mobile) {
		repo.saveMobile(mobile);
		
	}

	@Override
	public List<Mobile> showAllMobiles() {
		
		return repo.findAllMobiles();
	}

	@Override
	public String updateMobile(Mobile mobile) {
		
		return repo.updateMobile(mobile);
	}

	@Override
	public String deleteMobile(Mobile mobile) {
		
		return repo.deleteMobile(mobile);
	}

}
