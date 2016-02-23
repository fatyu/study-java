package org.fatyu.gui.swing;

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
        final JPanel northPanel = new JPanel(); //���
        northPanel.setLayout(new GridLayout(2, 2)); //������岼��
        northPanel.add(new JLabel("User Name :",
                                  SwingConstants.RIGHT)); //��ӱ�ǩ�������
        northPanel.add(jef); //��������
        northPanel.add(new JLabel("Password :", SwingConstants.RIGHT));
        northPanel.add(jpf);
        this.add(northPanel, BorderLayout.NORTH); //����������frame��

        final JTextArea jta = new JTextArea(8, 40); //������ʮ��
        final JScrollPane jsp = new JScrollPane(jta);
        this.add(jsp, BorderLayout.CENTER);

        final JPanel sourthjp = new JPanel();
        final JButton btn = new JButton("append str");
        sourthjp.add(btn);
        btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    jta.append("User name is " + jef.getText() +
                               "\nPassword is " +
                               new String(jpf.getPassword()));
                }
            });

        this.add(sourthjp, BorderLayout.SOUTH);
    }
}
