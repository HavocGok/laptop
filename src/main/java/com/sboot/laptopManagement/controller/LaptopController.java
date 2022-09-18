package com.sboot.laptopManagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sboot.laptopManagement.entity.Laptop;
import com.sboot.laptopManagement.service.LaptopService;

@Controller
public class LaptopController {
	
	@Autowired
	private LaptopService ls;
	
	@PostMapping("addlaptop")
	@ResponseBody
	public String addLaptop( Laptop l)
	{
		
		
		return ls.addLaptop(l);
	}
	@RequestMapping("home")
	
	public String getLaptopHome(){
		return "Home.jsp";
	}
	
	@RequestMapping("viewlaptop")
	@ResponseBody
	public String viewBook(@PathVariable int lid){
		return ls.viewLaptop(lid);
	}
	
	@RequestMapping("viewalllaptop")
	@ResponseBody
	public String viewAllLaptop(){
		return ls.viewAllLaptop();
	}
	
	@RequestMapping("updatelaptop")
	@ResponseBody
	public String updateLaptop(@RequestBody Laptop l)
	{
		return ls.updateLaptop(l);
	}
	
	@RequestMapping("deletelaptop")
	
	public String deleteLapto(@PathVariable int lid){
		return ls.deleteLaptop(lid);
	}
	
}

