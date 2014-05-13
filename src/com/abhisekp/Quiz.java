package com.abhisekp;

import com.abhisekp.gui.QuizGUI;

import java.util.ArrayList;

/**
 * Author: AbhisekP
 * Creation Date: 13-05-2014 08:15 PM
 * Description: Create a Quiz interface to build & play quiz
 */
public class Quiz {

	private ArrayList QuizCardList;

	public Quiz() {
		QuizCardList = new ArrayList<QuizCard>();

		// Run the Quiz App
		run();
	}

	public static void main(String[] args) {
		// Create a new Quiz
		new Quiz();
	}

	private void run() {
		new QuizGUI("Java Quiz");
	}

}
