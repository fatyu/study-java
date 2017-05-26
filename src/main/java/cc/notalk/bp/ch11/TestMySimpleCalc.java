package cc.notalk.bp.ch11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 使用<b>Facade</b>模式编写一个加法运算器
 * 
 * @@持有对象的引用
 * 
 * @author fatyu
 * 
 */
public class TestMySimpleCalc {
	public static void main(String[] args) {
		new CalcFrame().lunchFrame();
	}
}

/**
 * 计算器窗体框架
 * 
 * @author fatyu
 * 
 */
class CalcFrame extends Frame {

	private static final long serialVersionUID = 6999903749346721819L;
	// 三个输入框
	TextField tf1;
	TextField tf2;
	TextField tf3;

	public void lunchFrame() {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());

		frame.setBounds(200, 200, 600, 100);
		frame.setResizable(false);
		frame.setTitle("Simple + Calc");

		tf1 = new TextField(10);
		Label label = new Label("+");
		tf2 = new TextField(10);
		Button b = new Button("=");
		b.addActionListener(new FacadeListener(this));
		tf3 = new TextField(15);
		tf3.setEditable(false);// 设置第三个为只读
		frame.add(tf1);
		frame.add(label);
		frame.add(tf2);
		frame.add(b);
		frame.add(tf3);

		frame.pack();
		frame.setVisible(true);

	}
}

class FacadeListener implements ActionListener {

	private CalcFrame calcFrame;

	public FacadeListener(CalcFrame calcFrame) {
		this.calcFrame = calcFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = calcFrame.tf1.getText();
		String s2 = calcFrame.tf2.getText();

		if (null != s1 && !("".equals(s1)) && null != s2 && !("".equals(s2))) {
			double a = Double.parseDouble(s1);
			double b = Double.parseDouble(s2);
			calcFrame.tf3.setText("" + (a + b));
		} else {
			calcFrame.tf3.setText("Please input data!");
		}
	}
}
