/*
 * File: 		PriorityWrapperComparatorTest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.lazari.decider.priorize.impl.priorizers.PriorityWrapper;
import ch.lazari.decider.priorize.impl.priorizers.PriorityWrapperComparator;

/**
 * Test for PriorityWrapperComparator
 */
public class PriorityWrapperComparatorTest {

	private static final long FIRST = Long.MAX_VALUE;
	
	private static final long SECOND = Long.MIN_VALUE;
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.priorizers.PriorityWrapperComparator#compare(ch.lazari.decider.priorize.impl.priorizers.PriorityWrapper, ch.lazari.decider.priorize.impl.priorizers.PriorityWrapper)}.
	 */
	@Test
	public void testCompare() {
		final PriorityWrapper first = new PriorityWrapper(null, FIRST);
		final PriorityWrapper second = new PriorityWrapper(null, SECOND);
		final PriorityWrapperComparator comparator = new PriorityWrapperComparator();
		assertEquals(-1, comparator.compare(first, second)); // First is bigger than second
		assertEquals(1, comparator.compare(second, first)); // Second is bigger than first
	}

}
