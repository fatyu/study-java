package com.fatyu.ch09.producerConsumer;

/**
 * 产品类
 * 
 * @@author Fatyu
 * 
 */
public class Product {

	long id;

	public Product(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product_" + id;
	}

}
