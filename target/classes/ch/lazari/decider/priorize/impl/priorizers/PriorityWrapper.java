/*
 * File: 		PriorityWrapper.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.priorizers;

import ch.lazari.decider.priorize.api.Titled;

/**
 * Wraps titled objects for use with Priorizers
 */
public class PriorityWrapper {

	private final Titled titled;
	
	private final long ranking;
	
	/**
	 * Creates a new Priority Wrapper using the given titled and ranking
	 * @param titled Object that should be priorized 
	 * @param ranking The ranking the object should have
	 */
	public PriorityWrapper(final Titled titled, final long ranking) {
		this.titled = titled;
		this.ranking = ranking;
	}
	
	/**
	 * @return Ranking of the priorized object
	 */
	public long getRanking() {
		return ranking;
	}
	
	/**
	 * @return Object to be priorized
	 */
	public Titled getTitled() {
		return titled;
	}
}
