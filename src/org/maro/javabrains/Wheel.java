package org.maro.javabrains;

public class Wheel {
	private int diameter;
	
	public Wheel(int diameter) {
		this.diameter = diameter;
	}
	
	public void display()	{
		System.out.println("DIAMETER : " + diameter);
	}
}
