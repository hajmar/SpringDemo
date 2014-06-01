package org.hnm736.interviewPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonExampleTest {

	@Test(timeout=13)
	public void TwoObjectCretedByOneSingletonTest() throws InterruptedException {
		SingletonExample single = SingletonExample.getInstance();
		SingletonExample secondRef = SingletonExample.getInstance();
		Thread.yield();
		Thread.sleep(10);
		assertSame(single, secondRef);
	}

}
