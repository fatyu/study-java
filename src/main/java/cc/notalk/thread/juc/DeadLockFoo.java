package cc.notalk.thread.juc;
public class DeadLockFoo {
 public static void main(String args[]) {
  Operator o1 = new Operator();
  Operator o2 = new Operator();
  o1.anotherOperator = o2;
  o2.anotherOperator = o1;
  Thread t1 = new Thread(o1);
  Thread t2 = new Thread(o2);
  t1.start();
  t2.start();
 }
}
class Operator implements Runnable {
 Operator anotherOperator;
 public synchronized void methodA() {
  System.out.println(Thread.currentThread().getName() + ":begin methodA");
  try {
   Thread.sleep(1000);
  } catch (Exception e) {
   e.printStackTrace();
  }
  System.out.println(Thread.currentThread().getName() + ":call another methodA");
  anotherOperator.methodA();
  System.out.println(Thread.currentThread().getName() + ":end methodA");
 }
 public void run() {
  methodA();
 }
}