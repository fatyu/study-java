package cc.notalk.thread.juc;
/**
 * <p>
 * 一个对象是否是线程安全的取决于<b>是否被多个线程访问</b> <br/>
 * 使用 <b>同步</b> 来控制对象的<b>可变状态</b>的访问
 * </p>
 *
 * 当类封装了自己的状态时,线程安全类才有意义!
 */
public class _001ThreadSafe {
 /**
  * 状态的解释： 有状态就是有数据存储功能。有状态对象(Stateful
  * Bean)，就是有实例变量的对象，可以保存数据，是非线程安全的。在不同方法调用间不保留任何状态。
  *
  * 无状态就是一次操作，不能保存数据。无状态对象(Stateless Bean)，就是没有实例变量的对象.不能保存数据，是不变类，是线程安全的。
  *
  * Servlet实现线程安全的三种方式:
  *
  * 1、实现 SingleThreadModel 接口
  *
  * Public class Concurrent Test extends HttpServlet implements
  * SingleThreadModel { ………… }
  *
  * 2、同步对共享数据的操作
  *
  * 使用synchronized 关键字能保证一次只有一个线程可以访问被保护的区段，
  *
  * 3、避免使用实例变量
  *
  * 只要在Servlet里面的任何方法里面都不使用实例变量，那么该Servlet就是线程安全的。
  *
  */
}
