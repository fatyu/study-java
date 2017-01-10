package org.fatyu.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class OpenDialogFoo extends JFrame {
	public OpenDialogFoo() {
		super();
	}

	public static void main(String[] args) {
		OpenDialogFoo odf = new OpenDialogFoo();
		odf.setVisible(true);
		odf.setSize(600, 600);

		JButton btn = new JButton();
		odf.add(btn);
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				jfc.showSaveDialog(null);
			}
		});
	}
}
