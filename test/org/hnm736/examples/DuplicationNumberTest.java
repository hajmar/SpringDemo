package org.hnm736.examples;

import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DuplicationNumberTest  {
	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setStreams()	{
		System.setOut(outContent);
	}
	
	@Test
	@Ignore
	public void checkDuplicateBasicTest() {
		
		DuplicationNumber underTest = new DuplicationNumber();
		
		Integer [] testOfDuplicate = {1,2,3,4,5,6,8,4};
		
		assertThat(underTest.findDuplicateNumber(testOfDuplicate), "Duplicate");
		
		
	}
	
	@After
	public void postCondition()	{
		System.setOut(null);
	}

}
