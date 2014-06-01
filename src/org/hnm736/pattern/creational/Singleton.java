package org.hnm736.pattern.creational;

final public class Singleton {

	private static Singleton single;
	
	private Singleton()	{
	}
	
	public static synchronized Singleton getSingleton()	{
		if ( null == single ){
			single = new Singleton();
		}
		
		return single;
	}
	
}

final class DoubleLockSingleton 	{
	private static DoubleLockSingleton doubleLock;
	
	public static DoubleLockSingleton getInstance()		{
		return doubleLock;
	}
}
