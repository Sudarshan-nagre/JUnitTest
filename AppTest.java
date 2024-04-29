package com.sud.JUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	App a;
	
	@Before
	public void ObjectCreate() {
		 a = new App();
	}

	@After
	public void ObjectDestroy() {
		a=null;
	}
	
	@Ignore
	@Test
	public void addTest1() {
		assertEquals(20, a.add(7, 13));
	}
	
	@Test
	public void isBooleanTest() {
		assertTrue(a.isBoolean());
	}
	
	@Test
	public void isBooleanTestFalse() {
		assertFalse(a.isBoolean());
	}
	
	@Test
	public void appTest() {
		assertNotNull(a.app());
	}
}
