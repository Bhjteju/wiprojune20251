package com.wipro.repo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.wipro.dto.Mobile;

@Repository
public class MobileRepo {
	
	List<Mobile> list=new CopyOnWriteArrayList<Mobile>();
	
	public void saveMobile(Mobile mobile)
	{
		list.add(mobile);
	}
	public List<Mobile> findAllMobiles()
	{
		
		return list;
	}
	public String updateMobile(Mobile mobile)
	{
		int i=0;
		for(Mobile m:list) {
			if(m.getId()==mobile.getId())
			{
				list.set(i,mobile);
			}
			i++;
		}
		return mobile.getId()+" id updated";
	}
	public String deleteMobile(Mobile mobile)
	{
//		int i=0;
//		for(Mobile m:list)
//		{
//			if(m.getId()==mobile.getId())
//			{
//				list.remove(i);
//			}
//			i++;
//		}
		System.out.println(mobile);
		list.remove(mobile);
		
		return mobile.getId()+" id is deleted";
	}
	
}
