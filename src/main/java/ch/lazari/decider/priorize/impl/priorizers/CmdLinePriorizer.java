/*
 * File: 		CmdLinePriorizer.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import java.util.List;
import java.util.Random;

import ch.lazari.decider.priorize.api.Titled;
import ch.lazari.decider.priorize.api.UI;
import ch.lazari.decider.priorize.impl.ui.CmdLineUI;

/**
 * Priorizes a list of option through the command line
 */
public class CmdLinePriorizer extends AbstractPriorizer {

	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.impl.priorizers.AbstractPriorizer#createWrapped(java.util.List)
	 */
	@Override
	protected List<PriorityWrapper> createPriorizedList(List<Titled> list) {
		final CompareAll helper = new CompareAll(list);
		final UI ui = new CmdLineUI();
		final Random coin = new Random(System.currentTimeMillis());
		
		while (helper.hasNext()) {
			helper.next();
			if (coin.nextBoolean()) {
				helper.setWinner(ui.getWinner(helper.getCompare(), helper.getCurrent()));
			} else {
				helper.setWinner(ui.getWinner(helper.getCurrent(), helper.getCompare()));
			}
		}
		for(final PriorityWrapper wrapped : helper.result()) {
			System.out.println(String.format("%s (%d)", wrapped.getTitled().getTitle(), wrapped.getRanking()));
		}
		return helper.result();
	}				
}
