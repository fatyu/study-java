package cc.notalk.thread.juc;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CurrentPCFoo {
 public static void main(String[] args) {
  ExecutorService pool = Executors.newFixedThreadPool(10);
  BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
  ProducerThread p = new ProducerThread(queue);
  ConsumerThread c = new ConsumerThread(queue);
  p.setName("生产者");
  c.setName("消费者");
  pool.submit(p);
  pool.submit(c);
  pool.shutdown();
 }
}
class ProducerThread extends Thread {
 private BlockingQueue<Integer> queue;
 public ProducerThread(BlockingQueue<Integer> queue) {
  this.queue = queue;
 }
 public void run() {
  while (true)
   try {
    queue.put(1);
    Thread.sleep(1000);
    System.out.println(Thread.currentThread().getName() + "生产了1个" + ">>>>>>>>>>>>queue里共有" + queue.size());
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
 }
}
class ConsumerThread extends Thread {
 private BlockingQueue<Integer> queue;
 public ConsumerThread(BlockingQueue<Integer> queue) {
  this.queue = queue;
 }
 public void run() {
  while (true) {
   try {
    queue.take();
    Thread.sleep(5000);
    System.err.println(Thread.currentThread().getName() + "消费了1个" + ">>>>>>>>>>>>queue里还有" + queue.size());
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
 }
}