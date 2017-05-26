package cc.notalk.thread.juc;
import java.util.Vector;
public class MessageQueue {
 @SuppressWarnings({ "unchecked", "rawtypes" })
 private Vector<Object> msgs = new Vector();
 public Object receive() {
  synchronized (this) {//小范围的加锁
   Object msg = null;
   if (msgs.size() > 0) {
    msg = msgs.get(0);// 返回第一个对象
    msgs.removeElementAt(0);
   }
   return msg;
  }
 }
 public synchronized void send(Object msg) {
  synchronized (this) {//小范围的加锁
   msgs.add(msg);
  }
 }
}
