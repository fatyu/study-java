package org.fatyu.gui.swing;

import java.awt.FlowLayout;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SwingFoo extends JFrame {
	public SwingFoo() {
		super();
	}

	public static void main(String[] args) {
		SwingFoo wf = new SwingFoo();
		wf.setLayout(new FlowLayout());
		wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ť
		JButton b = new JButton("aaa");
		ButtonModel bm = b.getModel();
		b.setModel(bm);
		wf.setVisible(true);
		wf.setAlwaysOnTop(true);
		wf.setSize(500, 500);
		wf.setVisible(true);
		wf.add(b);
		//�ı������
		JTextField jtf = new JTextField("name:", 10);
		jtf.setColumns(20);
		wf.add(jtf);
		//��ǩ
		JLabel lab = new JLabel("<html>aaa<br/>bbb</html>"); //������ʹ��html��ǩ
		wf.add(lab);
	}
}
