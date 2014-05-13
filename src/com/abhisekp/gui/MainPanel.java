package com.abhisekp.gui;

import javax.swing.*;

/**
 * Author: AbhisekP
 * Creation Date: 13-05-2014 10:54 PM
 * Description:
 */
public abstract class MainPanel extends JPanel implements SaveQuiz, LoadQuiz {
	public abstract void buildGUI();
	MainPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
}
