package cc.notalk.thread.juc;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
public class ThreadNameFoo {
 public static void main(String[] args) {
  Thread t1 = new Thread(Thread.currentThread().getThreadGroup(), new Runnable() {
   public void run() {
    while (true) {
     try {
      Thread.sleep(1000);
      System.err.println(Thread.currentThread().getThreadGroup().getParent() + "-"
        + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
     } catch (InterruptedException e) {
      e.printStackTrace();
     }
    }
   }
  }, "ThreadName:irt");
  // t1.setName("[implements Runnable Thread]");
  t1.start();
 }
}
