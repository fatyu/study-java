package org.fatyu.gui;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class JFrameFoo extends JFrame {
	public JFrameFoo() {
		super();
	}

	public static void main(String[] args) throws UnsupportedLookAndFeelException {

		Toolkit tt = Toolkit.getDefaultToolkit();
		Image img = tt.getImage("1.ico");
		java.awt.Dimension d = tt.getScreenSize();
		JColorChooser jcc = new JColorChooser();
		UIManager.setLookAndFeel(UIManager.getLookAndFeel());
		JFrameFoo jframe = new JFrameFoo();
		jframe.add(jcc);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setAlwaysOnTop(true);
		jframe.setResizable(false);
		jframe.setSize(d.width / 2, d.height / 2);
		jframe.setTitle("zy");
		jframe.setIconImage(img);
		jframe.setVisible(true);

	}
}
