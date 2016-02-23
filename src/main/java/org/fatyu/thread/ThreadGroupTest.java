package org.fatyu.thread;

/**
 * 线程组-线程组表示一个线程的集合
 *
 * @author Fatyu
 * @see java.lang.ThreadGroup
 *
 */
public class ThreadGroupTest{

    public static void main(String[] args){
	// 构造一个新线程组。新线程组的父线程组是目前正在运行线程的线程组.
	ThreadGroup tg = new ThreadGroup("zhangyuThread");
	Thread t = new Thread(tg,"t1");
	System.out.println(tg.activeCount());
	t.start();
	// 线程组调用interrupt使得线程组里的线程全部中断
	tg.interrupt();
	System.out.println(tg.activeCount());
	System.out.println(tg.getName());
	System.out.println(tg.getParent());
    }
}
