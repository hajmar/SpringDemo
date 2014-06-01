package org.hnm736.javabrains;

public class Square {
	private Point pointA;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw()	{
		System.out.println("SQUARE DONE");
	}
}
