/*
 * File: 		Priorizable.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.api;

/**
 * Indicates that an object has title
 */
public interface Titled {

	/** Returns the title of the object */
	String getTitle();
	
	/** Defines the new title of the object */
	void setTitle(String newTitle);
}
