package org.fatyu.util;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class BakFile extends JFrame {

	private final JButton chooseFile = new JButton();// ѡ��ť

	public BakFile() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		getContentPane().setLayout(null);
		setSize(new Dimension(150, 80));
		this.chooseFile.setText("ѡ���ļ�");
		this.chooseFile.setBounds(new Rectangle(20, 20, 100, 20));
		this.chooseFile.addActionListener(new ActionListener() {// ��Ӽ�����
			@Override
			public void actionPerformed(ActionEvent e) {
				chooseFile_actionPerformed(e);
			}
		});
		getContentPane().add(this.chooseFile, null);// ����ť��ӵ�pane��
	}

	private void chooseFile_actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result = chooser.showOpenDialog(null);
		if (result != 0) {
			return;
		}
		String filePath = chooser.getSelectedFile().getPath();
		if (copy(filePath) == 1) {
			JOptionPane.showMessageDialog(null, "�ļ����ݳɹ�!!!", "��ʾ", 2);
		}
		;
	}

	private int copy(String filePath) {
		int flag = 0;
		File file = new File(filePath);

		if (file.isFile()) {
			File target = new File("e:/fatyu/bak/" + file.getName());
			FileInputStream fis = null;
			FileOutputStream fos = null;
			int c;

			try {
				fis = new FileInputStream(filePath);
				fos = new FileOutputStream(target);
				while ((c = fis.read()) != -1) {
					fos.write((char) c);
				}
				if ((c = fis.read()) == -1) {
					flag = 1;
				}
				fos.flush();// �������������ݽ���ˢ�²�ǿ��д�����е�����
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {

					fos.close();// �ر�������
					fis.close();// �ر������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			// �����ļ������κδ���
		}
		return flag;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame frame = new BakFile();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
