package com.fatyu.ch09;

public class TestThread {

	/**
	 * @@param args
	 */
	public static void main(String[] args) {

		Runner runner = new Runner();
		Thread thread = new Thread(runner);
		thread.start();
		int j = 0;
		while (j < 100) {
			System.out.println("Run From Main(" + j + ")");
			j++;
		}
	}

}

class Runner implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			System.out.println("Run From Runner..." + i);
			i++;
		}
	}

}
