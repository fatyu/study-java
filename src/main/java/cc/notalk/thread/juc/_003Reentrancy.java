package cc.notalk.thread.juc;
/**
 * 重进入请求是基于"每线程"而不是基于"每调用"
 *
 * @author Don
 *
 */
public class _003Reentrancy {
 public static void main(String[] args) {
  System.out.println(Object.class.getConstructors());
 }
}
