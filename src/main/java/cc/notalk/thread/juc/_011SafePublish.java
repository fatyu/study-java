package cc.notalk.thread.juc;
public class _011SafePublish {
}
/**
 * 对象的引用和状态必须对其他线程同时可见 <br/>
 * >1.通过静态初始化器初始化对象的引用<br/>
 * >2.将它的引用存储在volatile或者AtomicReference<br/>
 * >3.将它的引用存储在final域中<br/>
 * >4.存储在同步块中<br/>
 */
