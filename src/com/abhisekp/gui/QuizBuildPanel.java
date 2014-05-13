package com.abhisekp.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: AbhisekP
 * Creation Date: 13-05-2014 08:39 PM
 * Description: Quiz Builder GUI for creating quiz cards by entering question & answer.
 * - The cards set can be saved to a file.
 * - OR new card set can be created using the File menu.
 */
public class QuizBuildPanel extends MainPanel {

	// Add other required objects
	private static int quizIndex;
	// Add GUI Components used by various parts of GUI
	private JTextArea questionArea; // write question here
	private JTextArea answerArea; // write answers here
	private JButton nextCard;
	private JLabel labelQuestion;
	private JLabel labelAnswer;

	public QuizBuildPanel() {
		questionArea = new JTextArea(50, 60);
		answerArea = new JTextArea(30, 60);
		labelQuestion = new JLabel("Question");
		labelAnswer = new JLabel("Answer");
		nextCard = new JButton("Next Card");
		nextCard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		buildGUI();

		// Track Quiz number
		quizIndex++;
	}

	@Override
	public void buildGUI() {
		JScrollPane questionAreaScroll = new JScrollPane(questionArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JScrollPane answerAreaScroll = new JScrollPane(answerArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		System.out.println("Creating Quiz " + (quizIndex + 1));
		/* Build buildPanel GUI */
		add(labelQuestion);
		add(questionAreaScroll);
		add(labelAnswer);
		add(answerAreaScroll);
		add(nextCard);

		questionArea.requestFocusInWindow();
	}

	@Override
	public void saveQuiz() {
		// Add FileChooser using quizIndex+1

		// Add fileOutputStream

		// Add ObjectStream
	}

	@Override
	public void loadQuiz() {
		// Add FileChooser

		// Add fileInputStream

		// Add ObjectStream
	}
}
