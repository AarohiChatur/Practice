package com;

public class Pizza {

	String name;
	double size;
	String topings;	
	String base;
	double price;
	

	public Pizza(String pizzaname,String base, String topings,double size,double price) {
		this.size=size;
		this.name =pizzaname;
		this.topings=topings;
		this.base=base;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSize() {
		return size;

	}
	
	public String getTopings() {
		return topings;
	}
	
	public String getBase() {
		return base;

	}
	public double getPrice() {
		return price;
		
	}
}
