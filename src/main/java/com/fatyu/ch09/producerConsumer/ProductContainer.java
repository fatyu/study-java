package com.fatyu.ch09.producerConsumer;

public class ProductContainer {

	int index = 0;
	Product[] products = new Product[10];

	/**
	 * 生产产品
	 * 
	 * @@param product
	 */
	public synchronized void createProduct(Product product) {
		while (index == products.length) {
			try {
				this.wait();// 判断容器是否满载 满载情况下线程等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.notifyAll();// 启动其他线程-->非自身线程

		products[index] = product;
		System.out.println(products[index] + " was Producted!");
		index++;
		try {
			Thread.sleep((long) Math.random() * 1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	/**
	 * 消费产品
	 * 
	 * @@return
	 */
	public synchronized Product consumeProdut() {
		while (index == 0) {
			try {
				this.wait();// 判断容器是否满载 满载情况下线程等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.notifyAll();// 启动其他线程-->非自身线程

		index--;
		System.out.println(products[index] + " was Consumed!");
		try {
			Thread.sleep((long) Math.random() * 100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		return products[index];
	}
}
