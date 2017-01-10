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
		//按钮
		JButton b = new JButton("aaa");
		ButtonModel bm = b.getModel();
		b.setModel(bm);
		wf.setVisible(true);
		wf.setAlwaysOnTop(true);
		wf.setSize(500, 500);
		wf.setVisible(true);
		wf.add(b);
		//文本输入框
		JTextField jtf = new JTextField("name:", 10);
		jtf.setColumns(20);
		wf.add(jtf);
		//标签
		JLabel lab = new JLabel("<html>aaa<br/>bbb</html>"); //尽量不使用html标签
		wf.add(lab);
	}
}
