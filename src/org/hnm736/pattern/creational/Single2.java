package org.hnm736.pattern.creational;

public class Single2 {
	private static Single2 singleton;
	
	public static Single2 getInstance() {
		if (null == singleton)	{
			singleton = new Single2();
		}
		
		return singleton;
	}

}
