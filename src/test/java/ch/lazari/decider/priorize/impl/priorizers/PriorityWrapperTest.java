/*
 * File: 		PriorityWrapperTest.java
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

import ch.lazari.decider.priorize.impl.BasicTitled;
import ch.lazari.decider.priorize.impl.priorizers.PriorityWrapper;

/**
 * Test class for Priority Wrapper
 */
public class PriorityWrapperTest {

	private static final long RANKING = 42;	

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.priorizers.PriorityWrapper#PriorityWrapper(ch.lazari.decider.priorize.api.Titled, long)}.
	 */
	@Test
	public void testPriorityWrapper() {
		final BasicTitled fu = new BasicTitled();
		final PriorityWrapper toTest = new PriorityWrapper(fu, RANKING);
		assertEquals(fu, toTest.getTitled());
		assertEquals(RANKING, toTest.getRanking());
	}

}
