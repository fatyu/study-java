package cc.notalk.gui.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClickEventFoo {
	public ClickEventFoo() {
		super();
	}

	public static void main(String[] args) {
		ClickEventFrame cef = new ClickEventFrame();
		cef.setResizable(false);
		cef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ClickEventFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jp;

	public ClickEventFrame() {

		jp = new JPanel();
		JButton jb_yellow = new JButton("<html><font color='red'><b>yellow</b></font></html>");
		JButton jb_black = new JButton("black");
		JButton jb_red = new JButton("red");
		jp.add(jb_yellow);
		jp.add(jb_black);
		jp.add(jb_red);
		this.add(jp);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setSize(400, 400);
		jb_yellow.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jp.setBackground(Color.YELLOW);
			}
		});
		jb_black.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jp.setBackground(Color.BLACK);
			}
		});
		jb_red.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jp.setBackground(Color.RED);
			}
		});
	}
}
