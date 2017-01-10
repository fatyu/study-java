package com.fatyu.ch09.producerConsumer;

public class Producter implements Runnable {
	//引用一个PC调用其add方法
	private ProductContainer pc = null;

	Producter(ProductContainer pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {//生产十个
			Product product = new Product(i + 1);
			pc.createProduct(product);
		}
	}
}
