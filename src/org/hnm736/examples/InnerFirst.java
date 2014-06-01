package org.hnm736.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class InnerFirst {
	public static void main(String [] args)	{
		System.out.println(null + " ");
		
	}
}

class A	{
	String doA() throws FileAlreadyExistsException, NumberFormatException, FileNotFoundException	{
		return "A";
	}
}

class B	{
	String doA()	{
		return "B";
	}
}

class Ball	{
	enum Direction	{
		E(0),SE(1),S(2),SW(3),W(4),NW(5),N(6),NE(7);
	
		private int moveDirection;
		private Direction(int direction){
			this.moveDirection = direction;
		}
		
		public int getDirection()	{
			return moveDirection;
		}
		
		public void setDirection(int value){
			this.moveDirection = value%8;
		}
	}
	
	private int x,y;
	private Random random;
	
	public void move()	{
		List list = Collections.EMPTY_LIST;
		int i1 = 10;
		Integer i2 = new Integer(20); 
	}
}


class AA	{
	String showString()	throws Exception { return "b"; }
}

class BB extends A	{
	String showString() throws IOException, Exception, ClassCastException, IllegalArgumentException { return "bb"; }
}