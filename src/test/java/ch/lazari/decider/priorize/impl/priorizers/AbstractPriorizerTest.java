/*
 * File: 		AbstractPriorizerTest.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import ch.lazari.decider.priorize.api.Priorizer;
import ch.lazari.decider.priorize.api.Titled;

/**
 * Test Class for AbstractPriorizer
 */
public abstract class AbstractPriorizerTest {

	private final Priorizer testClass;
	
	public AbstractPriorizerTest(final Priorizer testClass) {
		this.testClass = testClass;
	}
	
	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.priorizers.AbstractPriorizer#priorize(java.util.Set)}.
	 */
	@Test
	public final void testPriorizeSetOfTitled() {
		final List<Titled> set = new ArrayList<Titled>();
		fill(set);
		final List<Titled> result = testClass.priorize(set);
		assertTrue(testSize(result));
		assertTrue(testOrder(result));
	}

	/**
	 * Test method for {@link ch.lazari.decider.priorize.impl.priorizers.AbstractPriorizer#priorize(java.util.List)}.
	 */
	@Test
	public final void testPriorizeListOfTitled() {
		final List<Titled> list = new ArrayList<Titled>();
		fill(list);
		final List<Titled> result = testClass.priorize(list);
		assertTrue(testSize(result));
		assertTrue(testOrder(result));
	}

	protected abstract void fill(final Collection<Titled> set);

	protected abstract boolean testSize(final List<Titled> result);
	
	protected abstract boolean testOrder(final List<Titled> result);
}
