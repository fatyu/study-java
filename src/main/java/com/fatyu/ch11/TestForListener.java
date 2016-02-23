package com.fatyu.ch11;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 监听机制采用的设计模式是:Observer[观察者模式]
 * 
 * @@author Fatyu
 * 
 */
public class TestForListener {
	public static void main(String[] args) {
		Frame frame = new Frame();

		Button b = new Button("Click Me");
		FyListener fl = new FyListener();
		b.addActionListener(fl);
		frame.setBounds(200,200,400,400);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.GRAY);
		frame.add(b);
		frame.setVisible(true);
		
	}
}

class FyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		System.out.println(b.getLabel() + "was clicked!");
	}
}
