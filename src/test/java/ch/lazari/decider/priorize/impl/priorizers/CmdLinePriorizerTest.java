/*
 * File: 		CmdLinePriorizerTest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import ch.lazari.decider.priorize.api.Priorizer;
import ch.lazari.decider.priorize.api.Titled;
import ch.lazari.decider.priorize.impl.BasicTitled;

/**
 * Responsibility:
 */
public class CmdLinePriorizerTest {

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.priorizers.AbstractPriorizer#priorize(java.util.Set)}.
	 */
	@Test
	public void testPriorizeSetOfTitled() {
		final Set<Titled> list = new HashSet<Titled>();
		list.add(new BasicTitled("Achievements"));
		list.add(new BasicTitled("Leveln"));
		list.add(new BasicTitled("Mount farmen"));
		list.add(new BasicTitled("Pets farmen"));
		list.add(new BasicTitled("Turnier"));
		list.add(new BasicTitled("Tol Barad"));
		
		final Priorizer priorizer = new CmdLinePriorizer();
		final List<Titled> sorted = priorizer.priorize(list);
	
		int index = 1;
		System.out.println("Result:");
		for(final Titled item : sorted) {
			System.out.println(String.format("%d. %s", index++, item.getTitle()));
		}
		System.out.println("Finished");
	}

}
