package com.fatyu.ch11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.io.Serializable;

public class FrameContainPanel extends Frame implements Serializable {

	private static final long serialVersionUID = -3922019012653250563L;

	Panel panel = new Panel(null);

	int startX, startY, width, height;

	public FrameContainPanel(int startX, int startY, int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;

		this.setBounds(startX, startY, width, height);
		this.setTitle("Frame with a Panel");
		this.setLayout(null);
		this.setBackground(new Color(0, 0, 255));
		this.setResizable(false);
		panel.setBounds(width / 4, height / 4, width / 2, height / 2);

		panel.setBackground(new Color(255, 255, 0));
		this.add(panel);
	}

	public static void main(String[] args) {
		FrameContainPanel fcp = new FrameContainPanel(100, 200, 800, 300);
		fcp.setVisible(true);
	}
}
