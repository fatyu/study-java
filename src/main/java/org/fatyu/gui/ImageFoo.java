package org.fatyu.gui;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import java.io.File;
import java.io.IOException;

import java.lang.reflect.InvocationTargetException;

import javax.imageio.ImageIO;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ImageFoo {
	public ImageFoo() {
		super();
	}

	public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException {
		EventQueue.invokeAndWait(new Runnable() {
			public void run() {
				ImageFrame iframe = null;
				try {
					iframe = new ImageFrame();
				} catch (IOException e) {
				}
				iframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}

		});

	}
}

@SuppressWarnings("serial")
class ImageFrame extends JFrame {
	public ImageFrame() throws IOException {
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setSize(500, 360);
		this.setResizable(false);
		ImageComponent ic = new ImageComponent();
		this.add(ic);
	}
}

@SuppressWarnings("serial")
class ImageComponent extends JComponent {
	private Image img;

	public ImageComponent() throws IOException {
		img = ImageIO.read(new File("E:\\12721623948906.jpg"));
	}

	@SuppressWarnings("unused")
	@Override
	protected void paintComponent(Graphics g) {
		if (img == null) {
			return;
		} else {
			int width = img.getWidth(this);
			int height = img.getHeight(this);
			g.drawImage(img, 0, 0, null);
		}
	}
}
