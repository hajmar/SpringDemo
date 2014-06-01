package org.hnm736.interviewPrograms;

public class SingletonExample {
	private static volatile SingletonExample instance;
	
	private SingletonExample()	{
		System.out.println("ONLY ONCE CREATED PER ");
	}
	
	public static SingletonExample getInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null)
					instance = new SingletonExample();
			}
		}
		return instance;
	}
	
}
