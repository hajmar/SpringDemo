package org.hnm736.pattern.creational;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingletonPatternTests {
	private Singleton singleton;
	private DoubleLockSingleton doubleLock;
	
	@Before
	public void setUp()	{
		doubleLock = DoubleLockSingleton.getInstance();
		singleton = Singleton.getSingleton();
	}
	
	@Test
	public void createSingleObjectTest() {
		Singleton testedSingletonObject = Singleton.getSingleton();
		assertSame(testedSingletonObject, singleton);
	}
	
	@Test
	public void checkEqualDefaultSingleTest()	{
		Singleton testedSingletonObject = Singleton.getSingleton();
		assertEquals(testedSingletonObject, singleton);
	}

	@Test(timeout=10)
	public void createDoubleLockObjectTest()	{
		DoubleLockSingleton testedObject = DoubleLockSingleton.getInstance();
		assertSame(testedObject, doubleLock);
	}
	
	
	
	
	private class InternalThread implements Runnable	{
		
		@Override
		public void run() {
			synchronized (doubleLock) {
				
			}
		}
	}
	
}
