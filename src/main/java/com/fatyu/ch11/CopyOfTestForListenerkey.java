package com.fatyu.ch11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Point;

/**
 * 监听机制采用的设计模式是:Observer[观察者模式]
 * 
 * @@author Fatyu
 * 
 */
public class CopyOfTestForListenerkey {
	public static void main(String[] args) {
		Frame frame = new Frame();
		int x = 100;
		int y = 100;
		frame.setBounds(x, y, 400, 400);
		frame.setBackground(Color.GRAY);
		frame.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				Frame f = (Frame) e.getSource();
				Point p = f.getLocation();

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					p.y -= 10;
					f.setLocation(p);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					p.y += 10;
					f.setLocation(p);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					p.x -= 10;
					f.setLocation(p);
				} else if (e.getKeyCode() != KeyEvent.VK_DOWN) {
					p.x += 10;
					f.setLocation(p);
				}
			}
		});

		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		frame.setVisible(true);

	}
}
