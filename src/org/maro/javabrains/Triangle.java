package org.maro.javabrains;

public class Triangle {
	private Point A;
	private Point B;
	private Point C;
//	
//	public Triangle(Point a, Point b, Point c) {
//		super();
//		A = a;
//		B = b;
//		C = c;
//	}

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public void draw()	{
		System.out.println(" Triangle drawn  : " + C.getX() + " " + B.getX() + " " + A.getX() );
	}
}
