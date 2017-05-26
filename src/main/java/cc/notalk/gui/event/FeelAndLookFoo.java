package cc.notalk.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FeelAndLookFoo {
	public FeelAndLookFoo() {
		super();
	}

	public static void main(String[] args) {
		FALFrame fal = new FALFrame();
		fal.setVisible(true);
		fal.setTitle("platFrame");
		fal.setAlwaysOnTop(true);
		fal.setResizable(false);
		fal.setSize(400, 400);
		fal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class FALFrame extends JFrame {
	private JPanel buttonPanel;

	public FALFrame() {

		buttonPanel = new JPanel();
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo lafi : infos) {
			System.out.println("|-name:" + lafi.getName() + "\n|-class name:" + lafi.getClassName()); //打印系统安装的FeelAndLook-name和classname
			this.createButton(lafi.getName(), lafi.getClassName());
		}
		this.add(buttonPanel);
	}

	void createButton(String name, final String className) {
		JButton button = new JButton(name);
		buttonPanel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(className);
					SwingUtilities.updateComponentTreeUI(FALFrame.this);
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});

	}
}
