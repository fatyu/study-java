package cc.notalk.thread.juc;
public class DaemonThreadFoo {
 public static void main(String[] args) throws Exception {
  DaemonThread t = new DaemonThread();
  t.setDaemon(true);// 将当前线程设置为守护线程,当User线程结束,此线程也将结束
  t.start();
  //	 t.interrupt();
  Thread.sleep(2000);// 使得主线程休眠2秒
  System.err.println("User线程结束,Daemon线程也结束!");
 }
}
class DaemonThread extends Thread {
 @Override
 public void run() {
  for (int i = 0; i < 10; i++) {
   try {
    Thread.sleep(1000);
    System.out.println("i=" + i);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
 }
}
