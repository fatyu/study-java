package com.fatyu.ch09;

/**
 * 测试线程死锁
 * 
 * @@author Fatyu
 */
public class TestDeadLockThread {
	public static void main(String[] args) {

		DeadLockThread dlt1 = new DeadLockThread();
		DeadLockThread dlt2 = new DeadLockThread();

		Thread t1 = new Thread(dlt1);
		Thread t2 = new Thread(dlt2);

		dlt1.flag = true;
		dlt2.flag = false;
		System.out.println(DeadLockThread.ro.resourceName);
		System.out.println(DeadLockThread.rt.resourceName);
		t1.start();
		t2.start();
	}
}

/**
 * 要达到线程死锁的效果要使得多个线程使用<b>共享</b>资源
 * 
 * @@author Fatyu
 * 
 */
class DeadLockThread extends Thread {
	public boolean flag;

	static ResourceOne ro = new ResourceOne();
	static ResourceTwo rt = new ResourceTwo();

	@Override
	public void run() {

		if (flag) {
			synchronized (ro) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (rt) {
					System.out.println("true was invoked");
				}
			}
		} else {
			synchronized (rt) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (ro) {
					System.out.println("flase was invoked");
				}
			}
		}
	}
}

class ResourceOne {

	String resourceName = "ResourceOne";

}

class ResourceTwo {
	String resourceName = "ResourceTwo";
}
