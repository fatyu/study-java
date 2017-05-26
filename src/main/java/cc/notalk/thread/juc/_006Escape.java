package cc.notalk.thread.juc;
public class _006Escape {
 // this逸出：指在构造函数返回之前其他线程就持有该对象的引用
 public static void main(String[] args) {
  new EscapeFoo();
 }
}
class EscapeFoo {
 private String name = "initString!";
 public EscapeFoo() {
  new Thread(new MyThread()).start();
  this.name = "final_String!";
 }
 class MyThread implements Runnable {
  public void run() {
   System.out.println(EscapeFoo.this.name);// 这是输出有可能是initString
             // 而不是final_String！此时又能能对象没有创建完成，线程已经启动，输出name
  }
 }
}
