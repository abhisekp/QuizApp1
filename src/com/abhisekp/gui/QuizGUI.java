package com.abhisekp.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: AbhisekP
 * Creation Date: 13-05-2014 08:33 PM
 * Description: GUI Interface for the quiz
 * - Add Quiz Builder to the frameContentPane when "new card" created.
 * - Add Quiz Player to the frameContentPane when "new play" created.
 */
public class QuizGUI extends JFrame {

	private final JMenuItem saveQuizItem;
	private final JMenuItem newQuizItem;
	private final JMenuItem playQuizItem;
	private final JMenu fileMenu;
	private final JMenuItem loadQuizItem;
	private JMenuBar mainMenuBar;
	private MainPanel currPanel;

	/**
	 * Create a quiz GUI
	 * @param quizName Name the current quiz
	 */
	public QuizGUI(String quizName) {
		// Set a GUI size (default: 800 x 600)
		Dimension frameSize = new Dimension(800, 600);
		setSize(frameSize);

		// Initialize menus
		mainMenuBar = new JMenuBar();
		fileMenu = new JMenu("File");

		// New Item
		newQuizItem = new JMenuItem("New Quiz");
		newQuizItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buildQuiz();
			}
		});

		// Save Item
		saveQuizItem = new JMenuItem("Save Quiz");
		saveQuizItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currPanel.saveQuiz();
			}
		});

		// Play Item
		playQuizItem = new JMenuItem("Play Quizzes");
		playQuizItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				playQuiz();
			}
		});

		// Load Item
		loadQuizItem = new JMenuItem("Load Quiz");
		loadQuizItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currPanel.loadQuiz();
			}
		});

		// Add Components
		fileMenu.add(newQuizItem);
		fileMenu.add(playQuizItem);
		mainMenuBar.add(fileMenu);
		setJMenuBar(mainMenuBar);

		// Center the Window & other configs
		setTitle(quizName);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		requestFocus();
//		pack();
	}

	/**
	 * Execute when "play" quiz is clicked
	 */
	private void playQuiz() {
		// Create new PlayPanel
		currPanel = new QuizPlayPanel();

		// recreate fileMenu
		fileMenu.removeAll();
		fileMenu.add(newQuizItem);
		fileMenu.add(loadQuizItem);

		// add fileMenu to menuBar
		mainMenuBar.removeAll();
		mainMenuBar.add(fileMenu);

		// set playPanel as contentPane
		setContentPane(currPanel);
		repaint();
	}

	/**
	 * Execute when "new" quiz is clicked
	 */
	private void buildQuiz() {
		// Create new BuildPanel
		currPanel = new QuizBuildPanel();

		// recreate fileMenu
		fileMenu.removeAll();
		fileMenu.add(newQuizItem);
		fileMenu.add(saveQuizItem);
		fileMenu.add(playQuizItem);

		// add fileMenu to menuBar
		mainMenuBar.removeAll();
		mainMenuBar.add(fileMenu);

		// set buildPanel as contentPane
		setContentPane(currPanel);
		repaint();
	}

}
