/*
 * File: 		BasicTitled.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl;

import static ch.lazari.decider.priorize.api.Config.UNDEFINED_TITLE;
import ch.lazari.decider.priorize.api.Titled;

/**
 * Generic Implementation of a titled object 
 */
public class BasicTitled implements Titled {
	
	private String title;
	
	/**
	 * Creates a new object with a preconfigured title
	 * @see ch.lazari.decider.priorize.api.Config#UNDEFINED_TITLE
	 */
	public BasicTitled() {
		this(UNDEFINED_TITLE);
	}
	
	/**
	 * Creates a new object with the given title. If the given title is <code>null</code> the preconfigured title is used
	 * @see ch.lazari.decider.priorize.api.Config#UNDEFINED_TITLE
	 */
	public BasicTitled(final String title) {
		setTitle(title);
	}
	
	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.api.Titled#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.api.Titled#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(final String newTitle) {
		if (isValid(newTitle)) {
			this.title = newTitle;
		} else {
			setTitle(UNDEFINED_TITLE);
		}
	}
	
	private boolean isValid(String title) {
		return title != null;
	}
	
	@Override
	public boolean equals(final Object compare) {
		if (compare instanceof Titled) {
			return hasSameTitle((Titled) compare);
		} else {
			return false;
		}
	}
	
	public boolean hasSameTitle(Titled compare) {
		return title.equalsIgnoreCase(compare.getTitle());
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
}
