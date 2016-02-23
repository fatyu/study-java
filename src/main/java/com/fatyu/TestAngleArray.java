package com.fatyu;

/**
 * 不规则多维数组
 * 
 * @@author Fatyu
 * 
 */
public class TestAngleArray {
	public static void main(String[] args) {
		final int MAX = 10;

		int[][] doubles = new int[MAX + 1][];// 实例化一个11行的二维数组
		/*
		 * 形成不规则的多维数组
		 */
		for (int i = 0; i <= MAX; i++) {
			doubles[i] = new int[i + 1];
		}			// 形成列数递加1的11行二维数组
		/*
		 * 为多位数组分别赋值
		 */

		for (int i = 0; i < doubles.length; i++) {//循环二维数组的行数
			for (int j = 0; j < doubles[i].length; j++) {//循环二维数组的列数
				int data = 1;
				for (int k = 1; k <= j; k++) {
					data = data * (i - k + 1) / k;
					doubles[i][j] = data;
				}
			}
		}
		for (int[] x : doubles) {
			for (int y : x) {
				System.out.printf("%4d", y);//输出每个y值占四位的格式

			}
			System.out.println();//每输出一行就执行一次换行
		}

	}
}
