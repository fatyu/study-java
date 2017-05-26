package cc.notalk.thread.juc;

/**
 * 1.volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。<br>
 * 2.当成员变量发生变化时，强迫线程将变化值回写到共享内存
 * 3.volatile关键字就是提示VM：对于这个成员变量不能保存它的私有拷贝，而应直接与共享成员变量交互
 * 注意:使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低
 * 
 * 如果这些简单数据类型声明为volatile，对它们的操作就会变成原子级别的。但这有一定的限制
 * 声明为volatile的简单变量如果当前值由该变量以前的值相关，那么volatile关键字不起作用，也就是说不是原子操作 CAS
 * 
 * volatile相对于synchronized是比较轻量级的同步机制。
 * 
 * 使用场景：
 * 1.写入操作不依赖于当前值
 * 2.变量不需要和其他变量共同参与不变约束
 * 3.访问变量时没有其他原因需要加锁。
 */
public class VolatileFoo {
 public static void main(String[] args) {
  final VolatileSample sample = new VolatileSample();

  new Thread(new Runnable() {
   public void run() {
    sample.finish();
   }
  }).start();
  int i = 10;
  while (i > 0) {
   new Thread(new Runnable() {
    public void run() {
     sample.doSomething();
    }
   }).start();
   i--;
  }

 }
}

class VolatileSample {
 private boolean finished;// 使用volatile修饰,任何线程读取此值都是从内存中读取,保证了读取内容一样
 private int lucky;

 public void doSomething() {
  if (finished) {
   System.out.println("lucky: " + lucky);
  }
 }

 public void finish() {

  finished = true;
  lucky = 7;
 }
}