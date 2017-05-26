package cc.notalk.thread.juc;
/**
 * {@code barrier[屏障]} 是一个简单的等待点,所有的线程在这一点同步他们的结果.要么合并结果,要么运行到整个任务的下一个阶段!
 *
 * @author Don
 */
public class BarrierFoo implements Runnable {
 String[] is;
 Barrier bpStart, bp1, bp2, bpEnd;
 public BarrierFoo(String[] is) {
  this.is = is;
  bpStart = new Barrier(is.length);
  bp1 = new Barrier(is.length);
  bp2 = new Barrier(is.length);
  bpEnd = new Barrier(is.length);
  for (int i = 0; i < is.length; i++) {
   (new Thread(this)).start();
  }
 }

	public void run() {
  try {
   int i = bpStart.waitForRest();
   doOne(is[i]);
   i = bp1.waitForRest();
   doTwo(is[i]);
   i = bp2.waitForRest();
   doThree(is[i]);
   i = bpEnd.waitForRest();
   doFour(is[i]);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }
 void doOne(String str) {
  System.out.println(Thread.currentThread().getName() + "::::::" + str);
 }
 void doTwo(String str) {
  System.out.println(Thread.currentThread().getName() + "::::::" + str);
 }
 void doThree(String str) {
  System.out.println(Thread.currentThread().getName() + "::::::" + str);
 }
 void doFour(String str) {
  System.out.println(Thread.currentThread().getName() + "::::::" + str);
 }
 public static void main(String[] args) {
  String[] strs = { "zy", "zy1", "zy2", "zy3", "zy4", "zy5" };
  new BarrierFoo(strs);
 }
}
class Barrier {
 private int threads2Wait4;// 记录等待的线程数
 private InterruptedException ie;
 public Barrier(int threads2Wait4) {
  super();
  this.threads2Wait4 = threads2Wait4;
 }
 public synchronized int waitForRest() throws InterruptedException {
  int threadNum = --threads2Wait4;
  if (null != ie) {
   throw ie;
  }
  if (threads2Wait4 <= 0) {
   // 当没有等待的线程时
   notifyAll();
   return threadNum;
  } else {
   while (threads2Wait4 > 0) {
    if (null != ie) {
     throw ie;
    } else {
     try {
      wait();
     } catch (InterruptedException interruptedException) {
      this.ie = interruptedException;
      notifyAll();
     }
    }
   }
  }
  return threadNum;
 }
 public synchronized void freeAll() {
  new InterruptedException("去除屏障");
  notifyAll();
 }
}
