package com.abhisekp;

import java.io.Serializable;

/**
 * Author: AbhisekP
 * Creation Date: 13-05-2014 08:49 PM
 * Description:
 */
public class QuizCard implements Serializable {
	private String question;
	private String answer;

	public QuizCard(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return this.question;
	}

	public String getAnswer() {
		return this.answer;
	}
}
