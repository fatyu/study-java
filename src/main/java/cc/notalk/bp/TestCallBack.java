package  cc.notalk.bp;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestCallBack {
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(5000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("Please Wait Five Seconds...");
		Toolkit.getDefaultToolkit().beep();
	}

}
