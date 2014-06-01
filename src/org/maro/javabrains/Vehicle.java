package org.maro.javabrains;

public class Vehicle {
	private String price;
	private Wheel wheel;
	
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void display()	{
		System.out.println("Price : " + price);
	}
}
