package com.fatyu.ch09.producerConsumer;

/**
 * 消费者类
 * 
 * @@author Fatyu
 * 
 */
public class Consumer implements Runnable {

	private ProductContainer pc;

	public Consumer(ProductContainer pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {//消费十次
			pc.consumeProdut();
		}
	}

}
