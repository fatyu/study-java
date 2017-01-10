package org.fatyu.thread;

/**
 * <pre>
 * 在线程被中断后不能再调用sleep(),wait(),join()方法.否则会抛出InterruptException
 * 再捕获InterruptException异常进行处理时,要将当前线程中断
 * </pre>
 * <br><code>
 * Thread.currentThread().interrupt();</code>
 * @@author Fatyu
 * @@see java.lang.Thread#interrupt()
 */
public class ThreadInterrupt {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		try {
			t.sleep(100);
			System.out.println("====================-");
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		t.interrupt(); //将线程中断
		try {
			t.sleep(100); //因为线程被中断,产生中断异常
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		} finally {
			System.out.println(t.isAlive());
		}
	}
}
