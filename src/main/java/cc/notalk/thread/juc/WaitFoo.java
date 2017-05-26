package cc.notalk.thread.juc;
public class WaitFoo {
 public synchronized void process() {
  System.out.println("-----");
  for (int i = 0; i < 50; i++) {
   System.out.println("=====");
   try {
    wait();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 }
}
