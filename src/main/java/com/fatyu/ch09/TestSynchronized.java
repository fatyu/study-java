package com.fatyu.ch09;

/**
 * 测试线程同步-->同步容易导致死锁问题的出现
 * @@哲学家吃饭
 * @@author Fatyu
 */
public class TestSynchronized extends Thread {

	NumCounter nc = new NumCounter();

	public static void main(String[] args) {
		TestSynchronized ts = new TestSynchronized();
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		nc.add(Thread.currentThread().getName());
	}

}

class NumCounter {
	private static int num = 0;

	// 1. 使用synchronized关键字进行声明方法为同步方法-->当前对象被lock
	public synchronized void add(String name) {
		num++;
		System.out.println(name + "\tCurrent num is" + num);
	}

	/*
	 * 2. synchronized(this){ public void add(String name) { num++;
	 * System.out.println(name + "\tCurrent num is" + num); } }
	 */
}
