package cc.notalk.jvm.jvmtools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeadLock {

	private static void whileTrueThread() {
		Thread st = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

				}
			}
		}, "while-true-thread");
		st.start();
	}

	private static void lockWaitThread(final Object lock) {
		Thread st = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (Exception e) {
					}
				}
			}
		}, "dead-lock-thread");
		st.start();
	}

	public static void main(String[] args) throws java.io.IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		reader.readLine();
		System.out.println("start whileTrueThread...");
		whileTrueThread();
		reader.readLine();
		System.out.println("start lockWaitThread...");
		Object obj = new Object();
		lockWaitThread(obj);//一直等待obj的锁
		System.out.println("run dead lock checker!");
		deadLockThread();
	}

	private static void deadLockThread() {
		int a = 1;
		int b = 2;
		for (int i = 0; i < 100; i++) {
			new Thread(new cc.notalk.jvm.jvmtools.DeadLock.DeadLockThread(a, b)).start();
			new Thread(new cc.notalk.jvm.jvmtools.DeadLock.DeadLockThread(b, a)).start();
		}

	}

	static class DeadLockThread implements Runnable {
		int a;
		int b;

		public DeadLockThread(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public void run() {
			synchronized (Integer.valueOf(a)) {//持有a对象锁
				synchronized (Integer.valueOf(b)) {//持有b对象锁
					System.out.println(a + b);
				}
			}
		}
	}
}
