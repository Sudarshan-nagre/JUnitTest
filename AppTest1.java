package com.sud.JUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest1 {

App a;
	
	@Before
	public void ObjectCreate() {
		 a = new App();
	}

	@After
	public void ObjectDestroy() {
		a=null;
	}
	
	@Test
	public void addTest() {
		assertEquals(10, a.add(9, 1));
	}

}
