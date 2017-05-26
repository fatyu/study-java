package cc.notalk.thread.juc;

public class JoinFoo {
 public static void main(String[] args) throws Exception {
  System.out.println(":::::主线程开始执行!");
  Thread t = new Thread(new SubThread());
  //t.setDaemon(true);
  t.start();
  //它的内部实现是wait(0)直至被调用线程执行完毕
  t.join();//使用它来控制线程的执行顺序,将此线程添加至当前正在运行的线程
  System.out.println(":::::主线程执行完毕!");
 }
}

class SubThread implements Runnable {

 public void run() {
  try {
   Thread.sleep(2000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  System.out.println("~子线程执行了两秒~");
 }
}