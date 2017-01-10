package org.fatyu.thread;

/**
 * <pre>
 * 线程的状态:
 * 1.New[新生]、
 * 2.Runnable[可运行]、
 * 3.Blocked[被阻塞]、{调用sleep方法,想要得到线程锁但是被其他线程持有,I/O操作阻塞}
 * 4.Dead[死亡]. {run方法执行完毕自然死亡,产生异常导致线程猝死}
 * </pre>
 * @author Fatyu
 *
 */
public class ThreadState {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(); //新生状态
		thread.start(); //可运行状态,此线程有可能是正在运行,也可能未运行
		thread.sleep(0); //进入阻塞状态
	}
}
