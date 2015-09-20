/*
 * File: 		CompareAll.java
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import ch.lazari.decider.priorize.api.Titled;

/**
 * Implementation for comparing one value in a list with every other value
 */
public class CompareAll {

	private final List<Titled> entries;
	
	private final Stack<Titled> unrated;
	
	private final Map<Titled, Integer> rated;
	
	private Titled current;
			
	private int index = 0;
	
	public CompareAll(final List<Titled> entries) {
		this.entries = new RandomPriorizer().priorize(entries);
		this.unrated = new Stack<Titled>();
		this.rated  = new HashMap<Titled, Integer>();
		for(final Titled item : this.entries) {
			unrated.push(item);
			rated.put(item, 0);
		}
		index = entries.size();
	}

	public boolean hasNext() {
		return entries.size() > 1;
	}

	public void next() {
		if (index < entries.size() - 1) {
			index++;
		} else {
			System.out.println("New Row");
			current = unrated.pop();
			entries.remove(current);
			index = 0;
		}
	}
	
	public List<PriorityWrapper> result() {
		final List<PriorityWrapper> list = new ArrayList<PriorityWrapper>(rated.size());
		for(final Entry<Titled, Integer> entry : rated.entrySet()) {
			list.add(new PriorityWrapper(entry.getKey(), entry.getValue().intValue()));
		}
		return list;
	}
	
	public Titled getCurrent() {
		return current;
	}
	
	public Titled getCompare() {
		return entries.toArray(new Titled[entries.size()])[index];
	}
	
	public void setWinner(final Titled winner) {
		final Integer victories = rated.get(winner);
		rated.put(winner, new Integer(victories.intValue() + 1));
	}
}
