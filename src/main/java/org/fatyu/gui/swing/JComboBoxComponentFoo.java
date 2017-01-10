package org.fatyu.gui.swing;

import java.awt.Font;

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
	@SuppressWarnings("rawtypes")
	private JComboBox jcb;
	private JPanel jp;
	private JLabel label = new JLabel("this is test label");
	private JSlider js;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JComboBoxComponentFrame() {
		this.setAlwaysOnTop(true);
		this.setSize(400, 400);
		this.setVisible(true);
		label.setFont(new Font("΢���ź�", Font.BOLD, 18));
		jp = new JPanel();
		add(jp);
		jcb = new JComboBox();
		jcb.addItem("����");
		jcb.addItem("΢���ź�");
		jcb.addItem("dialog");
		jp.add(jcb);
		jp.add(label);
		js = new JSlider();
		jp.add(js);
		jcb.addActionListener(e -> label.setFont(new Font((String) (jcb.getSelectedItem()), Font.BOLD, 18)));
	}

}
