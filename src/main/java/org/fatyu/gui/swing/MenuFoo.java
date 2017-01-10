package org.fatyu.gui.swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFoo {
	public static void main(String[] args) {
		MenuFrame mf = new MenuFrame();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

@SuppressWarnings("serial")
class MenuFrame extends JFrame {
	private JMenuBar menuBar;// 菜单栏
	private JMenu jm;// 菜单按钮

	public MenuFrame() {
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		this.setSize(400, 400);
		this.setBackground(Color.CYAN);
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		jm = new JMenu("zy");// 添加菜单到菜单栏
		JMenu jm1 = new JMenu("mxy");
		menuBar.add(jm);
		menuBar.add(jm1);
		// 添加菜单项到菜单
		JMenuItem new_jmd = new JMenuItem("New...",
				new ImageIcon("E:\\Work\\WorkSpace\\Java\\src\\org\\fatyu\\gui\\swing\\blue.gif"));//添加图片按钮
		JMenuItem del_jmd = new JMenuItem("Del...", 'D');//添加快捷按键
		jm.add(new_jmd);
		jm.add(del_jmd);
	}

}
