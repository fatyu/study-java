package com.fatyu;

/**
 * 不使用第三个变量进行数据的交换
 * @@author Fatyu
 * 
 */
public class SwapWithoutTemp {
	public static void main(String[] args) {
		int x, y;
		x = 100;
		y = 200;
		swap(x, y);

	}

	public static void swap(int x, int y) {
		System.out.println(" " + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(" " + x + " " + y);
	};
}
