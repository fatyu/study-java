package com.fatyu.ch05;

public class ValueArraySort {
	/**
	 * 降序排列
	 * 
	 * @@param args
	 */
	public static void desSort(int[] args) {
		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (args[i] < args[j]) {
					int temp = args[i];
					args[i] = args[j];
					args[j] = temp;
					System.out.println(args[i]);
					System.out.println(args[j]);
				}
			}
		}
	}

	/**
	 * @@优化的排序：方法一次遍历只执行一次变换
	 * @@param args
	 */
	public static void optimizedDesSort(int[] args) {

		int pointer;// 定义一个整型"pointer"表示最大数的下标

		for (int i = 0; i < args.length; i++) {
			pointer = i;
			
			for (int j = pointer; j < args.length; j++) {
				if (args[pointer] < args[j]) {
					pointer = j;
				}

			}
			
			if (pointer != i) {
				/*
				 * int temp = args[i]; args[i] = args[pointer]; args[pointer] =
				 * temp;
				 */
				swap(args, i, pointer);
			}
		}
	}

	/**
	 * This method is Come From James Gosling and Kevin A. Smith's
	 * SortAlgorithm.java 用于数组中两个整型数值的互换
	 * 
	 * @@param x
	 * @@param y
	 */
	private static void swap(int[] nums, int x, int y) {

		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}

	public static void main(String[] args) {
		int[] args1 = { 1, 4, 12, 6, 15 };
		optimizedDesSort(args1);
		for (int i : args1) {
			System.out.println(i);
		}
	}
}
