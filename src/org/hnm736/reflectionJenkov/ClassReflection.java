package org.hnm736.reflectionJenkov;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassReflection implements Serializable
{
	
	public static void main(String [] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException	{
		
		
	}	
	
	{
		System.out.println("");
	}
}

class TestedClass	{
	private String str;
	protected double b;
	public static final String ID="ASB";
	
	private int getStatus()	{
		System.out.println("GetStatus");
		return 1;
	}
	
	public void display(String a, Integer b){
		System.out.println("display method");
	}
	
}
