package cc.notalk.thread.juc;
public class SynchronizedOperatorFoo {
 public static void main(String[] args) {
  final MyClass clazz = new MyClass();
  for (int i = 0; i < 30; i++) {
   new Thread(new Runnable() {
    public void run() {
     clazz.say("" + Math.random());
    }
   }).start();
  }
 }
}
class MyClass {
 private int i = 0;
 public synchronized void say(String name) {
  i = i + 10;
  System.out.println(name + "[" + i + "]");
 }
}