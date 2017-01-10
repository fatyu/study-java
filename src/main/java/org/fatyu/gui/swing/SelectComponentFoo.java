package org.fatyu.gui.swing;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectComponentFoo {
	public SelectComponentFoo() {
		super();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@SuppressWarnings("unused")
			public void run() {
				SelectComponentFrame scf = new SelectComponentFrame();
			}
		});
	}
}

@SuppressWarnings("serial")
class SelectComponentFrame extends JFrame {
	private JCheckBox blod;
	private JCheckBox italic;
	JPanel jp = new JPanel();

	public SelectComponentFrame() {
		this.setName("SelectFrame");
		this.setAlwaysOnTop(true);
		this.setSize(600, 600);
		this.setVisible(true);
		add(jp);
		blod = new JCheckBox("BLOD");
		italic = new JCheckBox("ITALIC");
		italic = new JCheckBox("ITALIC");
		jp.add(blod);
		jp.add(italic);
	}

}
