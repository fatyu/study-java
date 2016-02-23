package org.fatyu.gui.adapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class WindowAdapterFoo {
    public WindowAdapterFoo() {
        super();
    }

    public static void main(String[] args) {
        WindowFrame wf = new WindowFrame();
        wf.addWindowListener(new WindowAdapter() {

                @Override
                public void windowIconified(WindowEvent e) {
                    System.out.println("iconed");
                }
            });

    }
}
@SuppressWarnings("serial")
class WindowFrame extends JFrame {
    public WindowFrame() {
        this.setAlwaysOnTop(true);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
