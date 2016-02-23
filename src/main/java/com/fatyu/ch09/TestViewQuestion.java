package com.fatyu.ch09;

/**
 * 有意思的面试题-->根据//注释部分的不同输出结果不同
 * 
 * @@author Fatyu
 * 
 */
public class TestViewQuestion {

	public static void main(String[] args) {
		ThreadViewQuestion twq = new ThreadViewQuestion();
		Thread t1 = new Thread(twq);
		Thread t2 = new Thread(twq);
		t1.start();
		t2.start();
		twq.method2();
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException ie) {
		// ie.printStackTrace();
		// }
		twq.method2();
	}
}

class ThreadViewQuestion implements Runnable {
	int i = 100;

	public synchronized void method1() {
		++i;
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException ie) {
		// ie.printStackTrace();
		// }
		System.out.println("i:" + i);
	}

	public void method2() {
		++i;
		System.out.println("i2" + i);
	}

	@Override
	public void run() {
		method1();
	}
}
