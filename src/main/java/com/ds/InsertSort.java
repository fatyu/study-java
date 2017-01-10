package com.ds;

/**
 * 插入排序
 * 
 * @author Fatyu
 * 
 */
public class InsertSort {
	public static void main(String[] args) {
		InsertSort.display(sort(create(10)));

	}

	/**
	 * 输出数组中的数字
	 * 
	 * @param array
	 */
	public static void display(int[] array) {
		/*
		 * for (int i = 0; i <= 9; i++) { System.out.println(array[i]); }
		 */

		for (int i : array) {// 增强的for循环
			System.out.println(i);
		}
	}

	/**
	 * 循环生成数组并赋值
	 * 
	 * @param num
	 */
	public static int[] create(int num) {
		int[] array = new int[num];
		array[0] = 2;
		array[1] = 72;
		array[2] = 6378789;
		array[3] = 8;
		array[4] = 123;
		array[5] = 52;
		array[6] = 22;
		array[7] = 222;
		array[8] = 12;
		array[9] = 23;
		return array;
	}

	/**
	 * 假设前段为有序数组 比较后面元素 插入前段数组中
	 * 默认array【0】是有序的 从array【1】开始插入排序
	 * @param array
	 * @@return
	 */
	public static int[] sort(int[] array) {
		int in;
		for (int out = 1; out < array.length; out++) {
			in = out;

			while (in > 0 && array[in - 1] > array[in]) {
				swap(array, in, in - 1);
				in--;
			}
		}
		return array;
	}

	/**
	 * 根据数组下标进行数组元素的交换
	 * 
	 * @param array
	 * @param a
	 * @param b
	 */
	public static void swap(int[] array, int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;

	}

}
