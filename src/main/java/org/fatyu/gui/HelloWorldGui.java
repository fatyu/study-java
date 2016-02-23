package org.fatyu.gui;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGui {
	public HelloWorldGui() {
		super();
	}

	public static void main(String[] args) {
		FrameFoo ff = new FrameFoo();

		ff.setVisible(true);
	}
}

@SuppressWarnings("serial")
class FrameFoo extends JFrame {
	public FrameFoo() {
		this.setTitle("test!");
		this.setSize(400, 400);
		PanelFoo pf = new PanelFoo();
		this.add(pf);
	}

}

@SuppressWarnings("serial")
class PanelFoo extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("fucking mz!!!", 100, 100);
	}
}
