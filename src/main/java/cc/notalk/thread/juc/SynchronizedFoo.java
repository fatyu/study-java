package cc.notalk.thread.juc;

public class SynchronizedFoo {
 public static void main(String[] args) {
  final ImplicitLock sample = new ImplicitLock();
  new Thread(new Runnable() {
   public void run() {
    sample.method2();
   }
  }).start();

  new Thread(new Runnable() {
   @SuppressWarnings("static-access")
   public void run() {
    sample.method1();
   }
  }).start();
 }
}

class ImplicitLock {
 public static synchronized void method1() {
  System.out.println(Thread.currentThread().getName() + "method1 executing...");
  try {
   Thread.sleep(3000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }

 public synchronized void method2() {
  System.out.println("method2 executing...");
  try {
   Thread.sleep(3000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }
}