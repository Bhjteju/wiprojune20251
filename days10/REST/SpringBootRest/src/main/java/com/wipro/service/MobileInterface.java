package com.wipro.service;

import java.util.List;

import com.wipro.dto.Mobile;

public interface MobileInterface {

	public void registerMobile(Mobile mobile);
	public  List<Mobile> showAllMobiles();
	public String updateMobile(Mobile mobile);
	public String deleteMobile(Mobile mobile);
}
