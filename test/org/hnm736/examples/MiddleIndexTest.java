package org.hnm736.examples;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class MiddleIndexTest extends TestCase {
	private MiddleIndex middleIndex;
	
	@Before 
	public void setUp()	{
		middleIndex = new MiddleIndex();
	}
	@Test(timeout=10)
	public void testFindIndexBadArrayReturnNoResult() {
		int testArray [] = { 1,2,3,4,5,6 };
		
		assertEquals(null, middleIndex.getIndex(testArray));
		
	}
	
	@Test(timeout=10)
	public void testFindIndexGoodArrayReturnIndex() {
		int testArray [] = { 1,2,3,3,2,1 };
		
		assertEquals(Integer.valueOf(2), middleIndex.getIndex(testArray));
		
	}
	

}
