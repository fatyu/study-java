package org.fatyu.gui.action;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class ActionFoo {
	public ActionFoo() {
		super();
	}

	public static void main(String[] args) {
		ActionFrame af = new ActionFrame();
		af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

@SuppressWarnings("serial")
class ActionFrame extends JFrame {
	private JPanel jp;

	public ActionFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		jp = new JPanel();
		this.add(jp);
		jp.add(new JButton(new ColorAction("YELLOW",
				new ImageIcon(Toolkit.getDefaultToolkit().getImage(ActionFoo.class.getResource("blue.gif"))),
				Color.YELLOW)));
		jp.add(new JButton(new ColorAction("RED",
				new ImageIcon(Toolkit.getDefaultToolkit().getImage(ActionFoo.class.getResource("blue.gif"))),
				Color.RED)));
		jp.add(new JButton(new ColorAction("BLUE",
				new ImageIcon(Toolkit.getDefaultToolkit().getImage(ActionFoo.class.getResource("blue.gif"))),
				Color.BLUE)));
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setVisible(true);

		InputMap im = jp.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		im.put(KeyStroke.getKeyStroke("Y"), "yellowb"); // ָ����ݼ�
		im.put(KeyStroke.getKeyStroke("R"), "redb"); // ָ����ݼ�
		im.put(KeyStroke.getKeyStroke("B"), "blueb"); // ָ����ݼ�

		ActionMap am = jp.getActionMap();
		am.put("yellowb", new ColorAction("YELLOW",
				new ImageIcon("E:\\Work\\Java\\Java\\src\\org\\fatyu\\gui\\action\\blue.gif"), Color.YELLOW)); // Ϊ��ݼ�ָ���¼�
		am.put("redb", new ColorAction("RED",
				new ImageIcon("E:\\Work\\Java\\Java\\src\\org\\fatyu\\gui\\action\\blue.gif"), Color.RED)); // Ϊ��ݼ�ָ���¼�
		am.put("blueb", new ColorAction("BLUE",
				new ImageIcon("E:\\Work\\Java\\Java\\src\\org\\fatyu\\gui\\action\\blue.gif"), Color.BLUE)); // Ϊ��ݼ�ָ���¼�
	}

	public class ColorAction extends AbstractAction {

		/**
		 * 
		 * @param name
		 *            ��ť����
		 * @param icon
		 *            ��ť��ͼ��
		 * @param c
		 *            ������ɫ
		 */
		public ColorAction(String name, Icon icon, Color c) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "set panel color to" + name.toLowerCase());
			putValue("color", c);
		}

		public void actionPerformed(ActionEvent e) {
			Color c = (Color) this.getValue("color");
			jp.setBackground(c); // ���������ɫ
		}
	}
}
