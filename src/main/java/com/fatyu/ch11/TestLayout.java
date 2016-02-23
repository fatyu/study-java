package com.fatyu.ch11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class TestLayout {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new GridLayout(2, 1));

		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new BorderLayout());

		Panel p3 = new Panel(new GridLayout(2,1));

		Panel p4 = new Panel(new GridLayout(2,1));

		Button[] buttons = new Button[8];
		for (int i = 1; i <= 8; i++) {
			buttons[i - 1] = new Button();
			buttons[i - 1].setLabel("Fatyu_" + i);
		}
		p1.add(buttons[0], BorderLayout.WEST);
		p1.add(buttons[1], BorderLayout.EAST);
		
		p1.add(p3, BorderLayout.CENTER);
		
		p3.add(buttons[2]);
		p3.add(buttons[3]);
		
		
		p2.add(buttons[4], BorderLayout.EAST);
		p2.add(buttons[5], BorderLayout.WEST);
		
		p2.add(p4, BorderLayout.CENTER);
		
		p4.add(buttons[6]);
		p4.add(buttons[7]);
		
		f.add(p1);
		f.add(p2);
		
		f.pack();
		f.setVisible(true);
	}

}
