package org.hnm736.pattern.creational;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.bind.annotation.RequestMapping;

public class Single2Test {
	private Single2 testedSingle;
	
	@Before
	public void setUp()	{
		
	}
	
	@Test
	public void createFirstTimeTest() {
		testedSingle =  Single2.getInstance();
	}
	
	@Test
	public void createSecondSingleVerifySameReferenceTest()	{
		testedSingle = Single2.getInstance();
		Single2 secondReference = Single2.getInstance();
		assertSame(testedSingle, secondReference);
	}

	
	
}
