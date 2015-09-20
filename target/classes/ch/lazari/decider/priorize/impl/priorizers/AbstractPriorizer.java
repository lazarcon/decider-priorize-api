/*
 * File: 		AbstractPriorizer.java
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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import ch.lazari.decider.priorize.api.Priorizer;
import ch.lazari.decider.priorize.api.Titled;

/**
 * Responsibility:
 */
public abstract class AbstractPriorizer implements Priorizer {

	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.api.Priorizer#priorize(java.util.Set)
	 */
	@Override
	public final List<Titled> priorize(Set<Titled> list) {
		return priorize(new ArrayList<Titled>(list));
	}
	
	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.api.Priorizer#priorize(java.util.List)
	 */
	@Override
	public final List<Titled> priorize(final List<Titled> list) {
		final List<PriorityWrapper> wrapped = createPriorizedList(list);
		Collections.sort(wrapped, new PriorityWrapperComparator());
		return toSet(wrapped);
	}

	private List<Titled> toSet(final List<PriorityWrapper> wrapped) {
		final List<Titled> result = new LinkedList<Titled>();
		for (final PriorityWrapper item : wrapped) {
			result.add(item.getTitled());
		}
		return result;
	}

	protected abstract List<PriorityWrapper> createPriorizedList(final List<Titled> list);

}
