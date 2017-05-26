package cc.notalk.thread.juc;
public class CreatThreadFoo {
 public static void main(String[] args) {
  // 实现runanble接口
  new Thread(new Runnable() {
   public void run() {
    int i = 1;
    while (i < 10) {
     System.out.println(i++);
    }
   }
  }).start();
  SonThread sonThread = new SonThread();
  new Thread(sonThread).start();
 }
}
// 继承Thread类,重写run方法
class SonThread extends Thread {
 @Override
 public void run() {
  super.run();
  int i = 1;
  while (i < 10) {
   System.out.println(i++);
  }
 }
}
