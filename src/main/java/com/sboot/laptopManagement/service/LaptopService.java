package com.sboot.laptopManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.laptopManagement.dao.LaptopDao;
import com.sboot.laptopManagement.entity.Laptop;


@Service
public class LaptopService {
	@Autowired
	private LaptopDao ll;
	
	
	public String addLaptop(Laptop l)
	{
		ll.save(l);
		return "Laptop Added";
	}
	
	public String viewLaptop(int lid)
	{
		Laptop l = ll.findById(lid).orElse(null);
		if(l!=null)
		{
			return l.toString();
		}
		return "Laptop Unavailable";
	}
	
	public String viewAllLaptop()
	{
		return ll.findAll().toString();
	}
	public String updateLaptop(Laptop l)
	{
		for(Laptop l1 : ll.findAll())
		{
			if(l1.getLid() == l.getLid())
			{
				ll.deleteById(l.getLid());
			}
		}
		ll.save(l);
		return "Laptop updated";
	}
	
	public String deleteLaptop(int lid) {
		for(Laptop l : ll.findAll())
		{
			if(lid == l.getLid())
			{
				ll.deleteById(lid);
				return "Laptop Deleted";
			}
		}
		return "Laptop unavailable";
	}
}

