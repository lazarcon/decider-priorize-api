/*
 * File: 		RandomPriorizer.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ch.lazari.decider.priorize.api.Titled;

/**
 * Random Implementaion of a Priorizer 
 */
public class RandomPriorizer extends AbstractPriorizer{

	private final Random dice = new Random(System.currentTimeMillis());

	@Override
	protected List<PriorityWrapper> createPriorizedList(final List<Titled> list) {
		final List<PriorityWrapper> wrapped = new ArrayList<PriorityWrapper>();
		for (Titled item : list) {
			wrapped.add(new PriorityWrapper(item, dice.nextLong()));
		}
		return wrapped;
	}	
}
