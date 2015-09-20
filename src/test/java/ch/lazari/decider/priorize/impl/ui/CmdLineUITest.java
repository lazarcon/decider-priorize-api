/*
 * File: 		CmdLineUITest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.ui;

import org.junit.Test;

import ch.lazari.decider.priorize.api.Titled;
import ch.lazari.decider.priorize.impl.BasicTitled;

/**
 * Test class for command line ui
 */
public class CmdLineUITest {
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.ui.CmdLineUI#getWinner(ch.lazari.decider.priorize.api.Titled, ch.lazari.decider.priorize.api.Titled)}.
	 */
	@Test
	public void testGetWinner() {
		final Titled first = new BasicTitled("first");
		final Titled second = new BasicTitled("second");
		final CmdLineUI toTest = new CmdLineUI();
		final Titled winner = toTest.getWinner(first, second);
		// TODO remove Sysos
		System.out.println("Winner is:");
		System.out.println(winner.getTitle());
		//fail("Not yet implemented");
	}
}
