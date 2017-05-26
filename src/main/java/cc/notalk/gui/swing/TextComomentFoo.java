package cc.notalk.gui.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextComomentFoo {
	public TextComomentFoo() {
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				TextComomentFrame tcf = new TextComomentFrame();
				tcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				tcf.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class TextComomentFrame extends JFrame {
	public TextComomentFrame() {
		this.setAlwaysOnTop(true);
		this.setSize(500, 500);
		this.setTitle("text");
		final JTextField jef = new JTextField();
		final JPasswordField jpf = new JPasswordField();
		jpf.setEchoChar('z');
		final JPanel northPanel = new JPanel(); //面板
		northPanel.setLayout(new GridLayout(2, 2)); //设置面板布局
		northPanel.add(new JLabel("User Name :", SwingConstants.RIGHT)); //添加标签至面板上
		northPanel.add(jef); //添加输入框
		northPanel.add(new JLabel("Password :", SwingConstants.RIGHT));
		northPanel.add(jpf);
		this.add(northPanel, BorderLayout.NORTH); //将面板添加至frame中

		final JTextArea jta = new JTextArea(8, 40); //八行四十列
		final JScrollPane jsp = new JScrollPane(jta);
		this.add(jsp, BorderLayout.CENTER);

		final JPanel sourthjp = new JPanel();
		final JButton btn = new JButton("append str");
		sourthjp.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jta.append("User name is " + jef.getText() + "\nPassword is " + new String(jpf.getPassword()));
			}
		});

		this.add(sourthjp, BorderLayout.SOUTH);
	}
}
