package org.hnm736.pattern.creational;

final public class Single3 {
	private Single3 instance;
	
	private Single3()	{
		System.out.println("Private create");
	}
	
	public synchronized Single3 getInstance()	{
		if ( null == instance )	{
			instance = new Single3();
		}
		return instance;
	}
	
	
}
