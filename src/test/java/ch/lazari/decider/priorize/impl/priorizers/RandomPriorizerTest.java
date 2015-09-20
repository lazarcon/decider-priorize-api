/*
 * File: 		RandomPriorizerTest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import java.util.Collection;
import java.util.List;

import ch.lazari.decider.priorize.api.Titled;
import ch.lazari.decider.priorize.impl.BasicTitled;

/**
 * Test for RandomPriorizer
 */
public class RandomPriorizerTest extends AbstractPriorizerTest {
	
	public RandomPriorizerTest() {
		super(new RandomPriorizer());
	}
	
	@Override
	protected boolean testSize(final List<Titled> result) {
		return result.size() == 4;
	}
	
	@Override
	protected boolean testOrder(final List<Titled> result) {
		final Titled[] array = result.toArray(new Titled[result.size()]);
		return (array[0].getTitle() != "Alpha") 
				|| (array[1].getTitle() != "Beta")
				|| (array[2].getTitle() != "Gamma")
				|| (array[3].getTitle() != "Delta");
	}
	
	@Override
	protected void fill(final Collection<Titled> empty) {
		empty.add(new BasicTitled("Alpha"));
		empty.add(new BasicTitled("Alpha"));
		empty.add(new BasicTitled("Beta"));
		empty.add(new BasicTitled("Gamma"));
		empty.add(new BasicTitled("Delta"));
	}
}
