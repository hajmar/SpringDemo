package org.hnm736.interviewPrograms;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FindMiddleIndexTest {
	private FindMiddleIndex testedObject;

	@Before
	public void setUp() {
		testedObject = new FindMiddleIndex();
	}

	@Test(expected = Exception.class)
	public void findIndexInTenProperArraySizeTest() throws Exception {
		int testedArray[] = { 2, 1, 2, 3, 4, 5, 5, 4, 1, 2, 3 };
		int result = 0;
		result = testedObject.getIndex(testedArray);

		assertEquals(result, 5);
	}

}
