package com.ds;

/**
 * 选择排序
 * 
 * @author Fatyu
 * 
 */
public class SelectSort {
	public static void main(String[] args) {
		SelectSort.display(sort(create(10)));
	}

	/**
	 * 输出数组中的数字
	 * 
	 * @param array
	 */
	public static void display(int[] array) {
		for (int i : array) {
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
		array[2] = 63;
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
	 * 全局比较选择'最'小的元素 然后交换 依次查找'最'元素进行交换
	 * 
	 * @param array
	 * @return
	 */
	public static int[] sort(int[] array) {
		int min = 0;// 用于标记最小值 默认最小值为array[0]
		int in;
		for (int out = 0; out < array.length - 1; out++) {// 外层循环-->用于循环每一个数组元素
			min = out;
			for (in = out + 1; in < array.length; in++) {
				if (array[min] > array[in]) {
					min = in;
					
				}
			}
			swap(array,out,min);
			
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

