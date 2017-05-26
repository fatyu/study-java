package cc.notalk.thread.juc;
public class EnumThreadFoo {
 public static void main(String[] args) {
  Thread t1 = new Thread();
  t1.start();
  Thread[] tg = new Thread[Thread.activeCount()];
  Thread.enumerate(tg);
  for (Thread t : tg) {
   System.out.println(t.getName());
  }
 }
}
