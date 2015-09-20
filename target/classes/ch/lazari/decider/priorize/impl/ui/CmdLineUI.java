/*
 * File: 		CmdLineUI.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.impl.ui;

import java.util.Scanner;

import ch.lazari.decider.priorize.api.Titled;
import ch.lazari.decider.priorize.api.UI;

/**
 * Responsibility:
 */
public class CmdLineUI implements UI {

	private final Scanner keyboard; 
	
	public CmdLineUI() {
		this.keyboard = new Scanner(System.in);
	}
	
	/* (non-Javadoc)
	 * @see ch.lazari.decider.priorize.api.UI#getWinner(ch.lazari.decider.priorize.api.Titled, ch.lazari.decider.priorize.api.Titled)
	 */
	@Override
	public Titled getWinner(final Titled first, final Titled second) {
		printOptions(first.getTitle(), second.getTitle());
		final char choice = getChoice();
		return choice == 'a' ? first : second;
	}
	
	private void printOptions(final String first, final String second) {
		System.out.print("a) ");
		System.out.println(first);
		System.out.print("b) ");
		System.out.println(second);
	}
	
	private char getChoice() {
		String choice = null;
		while (!(isValid(choice))) {
			System.out.println("Do you prefer a) or b)? ");
			choice = keyboard.nextLine();
		}
		return choice.charAt(0);
	}
	
	private boolean isValid(final String choice) {
		if (choice == null) {
			return false;
		} else if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A' 
				|| choice.charAt(0) == 'b' || choice.charAt(0) == 'B') {
			return true;
		} else {
			return false;
		}
	}
}
