/*
 * File: 		PriorityWrapperComparator.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import java.util.Comparator;

/**
 * Implements Comparator Logic for Priority objects
 */
public class PriorityWrapperComparator implements Comparator<PriorityWrapper> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(PriorityWrapper arg0, PriorityWrapper arg1) {
		final long delta = arg1.getRanking() - arg0.getRanking();
		return (int) delta;
	}
	
}
