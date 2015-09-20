/*
 * File: 		BasicTitledTest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl;

import static ch.lazari.decider.priorize.api.Config.UNDEFINED_TITLE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch.lazari.decider.priorize.impl.BasicTitled;

/**
 * Test for class "BasicTitled". Tests the class to 100%
 */
public class BasicTitledTest {

	private static final String VALID_TITLE = "valid title";
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#BasicTitled()}.
	 */
	@Test
	public void testBasicTitled() {
		final BasicTitled toTest = new BasicTitled();
		assertEquals(UNDEFINED_TITLE, toTest.getTitle());
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#BasicTitled(java.lang.String)}.
	 */
	@Test
	public void testBasicTitledStringNull() {
		final BasicTitled toTest = new BasicTitled(null);
		assertEquals(UNDEFINED_TITLE, toTest.getTitle());
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#BasicTitled(java.lang.String)}.
	 */
	@Test
	public void testBasicTitledStringNotNull() {
		final BasicTitled toTest = new BasicTitled(VALID_TITLE);
		assertEquals(VALID_TITLE, toTest.getTitle());
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#getTitle()}.
	 */
	@Test
	public void testGetTitle() {
		// Already tested above
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#setTitle(java.lang.String)}.
	 */
	@Test
	public void testSetTitle() {
		final BasicTitled toTest = new BasicTitled();
		toTest.setTitle(VALID_TITLE);
		assertEquals(VALID_TITLE, toTest.getTitle());		
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		final String TEST = "test";
		final BasicTitled toTest = new BasicTitled(TEST);
		assertEquals(TEST.hashCode(), toTest.hashCode());
	}
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#hasSameTitle(ch.lazari.decider.priorize.api.Titled)}.
	 */
	@Test
	public void testHasSameTitleTrue(){
		final BasicTitled obj1 = new BasicTitled("Title");
		final BasicTitled obj2 = new BasicTitled("title");
		assertTrue(obj1.hasSameTitle(obj2));
		assertTrue(obj2.hasSameTitle(obj1));
	}
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#hasSameTitle(ch.lazari.decider.priorize.api.Titled)}.
	 */
	@Test
	public void testHasSameTitleFalse(){
		final BasicTitled obj1 = new BasicTitled("first");
		final BasicTitled obj2 = new BasicTitled("second");
		assertFalse(obj1.hasSameTitle(obj2));
		assertFalse(obj2.hasSameTitle(obj1));
	}
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsTrue() {
		final BasicTitled obj1 = new BasicTitled("Title");
		final BasicTitled obj2 = new BasicTitled("title");
		assertTrue(obj1.equals(obj2));
		assertTrue(obj2.equals(obj1));		
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsFalseTitled() {
		final BasicTitled obj1 = new BasicTitled("first");
		final BasicTitled obj2 = new BasicTitled("second");
		assertFalse(obj1.equals(obj2));
		assertFalse(obj2.equals(obj1));		
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.BasicTitled#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsFalseObject() {
		final BasicTitled obj1 = new BasicTitled("first");
		final Object obj2 = new Object();
		assertFalse(obj1.equals(obj2));
	}

}
