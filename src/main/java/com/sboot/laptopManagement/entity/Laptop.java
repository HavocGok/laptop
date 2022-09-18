package com.sboot.laptopManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
      private int lid;
      private String lname;
      private String lcolor;
      private double lcost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lid, String lname, String lcolor, double lcost) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lcolor = lcolor;
		this.lcost = lcost;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcolor() {
		return lcolor;
	}
	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}
	public double getLcost() {
		return lcost;
	}
	public void setLcost(double lcost) {
		this.lcost = lcost;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lcolor=" + lcolor + ", lcost=" + lcost + "]";
	}
      
      
}
