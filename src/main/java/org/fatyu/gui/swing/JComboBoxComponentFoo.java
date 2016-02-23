package org.fatyu.gui.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JComboBoxComponentFoo {

	public static void main(String[] args) {
		JComboBoxComponentFrame jbcf = new JComboBoxComponentFrame();
		jbcf.setResizable(false);
	}

}

@SuppressWarnings("serial")
class JComboBoxComponentFrame extends JFrame {
	private JComboBox jcb;
	private JPanel jp;
	private JLabel label = new JLabel("this is test label");
	private JSlider js;

	public JComboBoxComponentFrame() {
		this.setAlwaysOnTop(true);
		this.setSize(400, 400);
		this.setVisible(true);
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		jp = new JPanel();
		add(jp);
		jcb = new JComboBox();
		jcb.addItem("ËÎÌå");
		jcb.addItem("Î¢ÈíÑÅºÚ");
		jcb.addItem("dialog");
		jp.add(jcb);
		jp.add(label);
		js = new JSlider();
		jp.add(js);
		jcb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font((String) (jcb.getSelectedItem()),
						Font.BOLD, 18));
			}
		});
	}

}
