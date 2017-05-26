package cc.notalk.thread.juc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LifeCycleFoo extends JFrame {
 private static final long serialVersionUID = 1L;
 private MyThread thread = null; // 要操作的线程
 private JTextField text = null; // 运行计数器
 private JLabel label = null; // 显示线程运行状态
 private JButton newButton = null, startButton = null, waitButton = null, stopButton = null; // 新生、启动、停滞、死亡 四个按钮
 private boolean isWait = false; // 是否为暂停状态

 public LifeCycleFoo() {
  super("线程生命周期");
  text = new JTextField(25);
  label = new JLabel(" ");
  newButton = new JButton("新生");
  newButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    thread = new MyThread();
    label.setText("新生");
   }
  });
  startButton = new JButton("执行");
  startButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    thread.start();
    label.setText("执行");
   }
  });
  waitButton = new JButton("停滞");
  waitButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    if (!isWait) { // 如果不是暂停状态
     isWait = true;
     waitButton.setText("继续");
    } else {
     isWait = false;
     synchronized (thread) {
      thread.notify(); // 继续
     }
     waitButton.setText("停滞");
    }
   }
  });
  stopButton = new JButton("死亡");
  stopButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    if (isWait) {
     isWait = false;
     synchronized (thread) {
      thread.notify();
      thread.notify();
     }
    }
    thread.quit();
    label.setText("死亡");
   }
  });
  JPanel pane = new JPanel();
  pane.add(label);
  pane.add(text);
  pane.add(newButton);
  pane.add(startButton);
  pane.add(waitButton);
  pane.add(stopButton);
  this.getContentPane().add(pane);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setSize(300, 200);
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 }

 class MyThread extends Thread {
  private int i = 0; // 计数器数值
  private boolean b = true; // 控制循环，也就是控制线程结束的boolean变量

  public MyThread() {
   i = 0;
   text.setText(Integer.toString(i));
  }

  public void quit() {
   this.b = false;
  }

  @SuppressWarnings("static-access")
  public synchronized void run() {
   while (b) {
    if (isWait) { // 这里决定了线程何时停滞
     try {
      wait(); // 只能在同步函数中调用wait()
     } catch (InterruptedException ex) {
      ex.printStackTrace();
     }
    }
    text.setText(Integer.toString(i++));
    try {
     this.sleep(100);
    } catch (InterruptedException ex) {
     ex.printStackTrace();
    }
   }
  }
 }

 public static void main(String[] args) {
  new LifeCycleFoo();
 }

}