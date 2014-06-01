package org.maro.javabrains;

public class Size {
	private int length;
	private int width;
	private Item A;
	public Item getA() {
		return A;
	}
	public void setA(Item a) {
		A = a;
	}
	public Item getB() {
		return B;
	}
	public void setB(Item b) {
		B = b;
	}
	private Item B;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void init()	{
		System.out.println("INIT SIZE method");
	}
	
	public void destroy()	{
		System.out.println("DESTROY SIZE method");
	}
	
	public void display()	{
		
	}
}



interface Testable	{
	public abstract void testMethod();
	public static final int PROGRESS_LEVEL =10;
}