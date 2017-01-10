package org.fatyu.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class EllipseFoo {
	public EllipseFoo() {
		super();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				EllipseFrame ef = new EllipseFrame();
				ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ef.setAlwaysOnTop(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class EllipseFrame extends JFrame {
	public EllipseFrame() {
		Toolkit tk = Toolkit.getDefaultToolkit();

		this.setTitle("DrawFrame");
		this.setVisible(true);
		this.setSize(tk.getScreenSize().width / 2, tk.getScreenSize().height / 2);
		EllipseComponent ellipseComponent = new EllipseComponent();
		this.add(ellipseComponent);
	}
}

@SuppressWarnings("serial")
class EllipseComponent extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED.brighter().brighter().brighter());
		//画长方形
		//    double leftX = 100;
		//    Rectangle2D r2d =
		//      new Rectangle2D.Double(leftX, leftX, leftX * 2, leftX * 2);
		//    g2d.draw(r2d);
		//    g2d.setColor(Color.black);

		//画线
		g2d.drawLine(100, 200, 200, 600); //调用griphic的划线方法  第一个点的x,y 第二个点的x,y
	}
}
