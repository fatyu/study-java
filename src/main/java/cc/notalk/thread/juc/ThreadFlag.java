package cc.notalk.thread.juc;
public class ThreadFlag {
 protected Thread threadFlag = null;
 public void getCurrentThread() {
  while (threadFlag != Thread.currentThread()) {
   if (threadFlag == null) {
    threadFlag = Thread.currentThread();
   }
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
 }
 public void freeFlag() {
  if (threadFlag == Thread.currentThread()) {
   threadFlag = null;
  }
 }
}
