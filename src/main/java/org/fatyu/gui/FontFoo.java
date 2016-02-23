package org.fatyu.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class FontFoo {
    public FontFoo() {
        super();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    FontFrame ef = new FontFrame();
                    ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ef.setAlwaysOnTop(true);
                }
            });
    }
}
@SuppressWarnings("serial")
class FontFrame extends JFrame {
    public FontFrame() {
        Toolkit tk = Toolkit.getDefaultToolkit();

        this.setTitle("FontFoo");
        this.setVisible(true);
        this.setSize(tk.getScreenSize().width / 3,
                     tk.getScreenSize().height / 4);
        FontComponent ellipseComponent = new FontComponent();
        this.add(ellipseComponent);
    }
}
@SuppressWarnings("serial")
class FontComponent extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.BLACK.brighter().brighter().brighter());
        //����
        Font f =
            new Font(Font.DIALOG_INPUT, Font.PLAIN, 16).deriveFont(20f).deriveFont(14);
        g2d.setFont(f);
        g2d.drawString("zhangyu", 50, 50);
        //����Ļ�м仭��
        //������ʾ��ʽ
        //1.�������ʽ����("iWaWa",Font.PLAIN,80) (��������,������ʽ,�����С)
        //2.�ַ���
        //3.��ʾ�豸(һ��ָ�ն���ʾ��Ļ)
        FontRenderContext frg = g2d.getFontRenderContext();

        //��ð�Χ�ַ����ľ���
        Rectangle2D r2d = f.getStringBounds("zhangyu", frg);
        double x = (getWidth() - r2d.getWidth()) / 2;
        double y = (getHeight() - r2d.getHeight()) / 2;
        double assent = -r2d.getY();
        double basey = y + assent;
        //����
        g2d.drawString("zhangyu", (int)x, (int)basey);
        //�����ο�
        g2d.drawRect((int)x, (int)y, (int)r2d.getWidth(),
                     (int)r2d.getHeight());

        //������
        g2d.draw(new Line2D.Double(x, basey, x + r2d.getWidth(), basey));
    }
}


