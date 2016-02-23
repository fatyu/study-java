package com.ds;

/**
 * 冒泡排序--使用整型数组进行排序
 * 
 * @author Fatyu
 * 
 */
public class BubbleSort
{
	public static void main(String[] args)
	{
		BubbleSort.display(sort(create(10)));
	}

	/**
	 * 输出数组中的数字
	 * 
	 * @param array
	 */
	public static void display(int[] array)
	{
		/*
		 * for (int i = 0; i <= 9; i++) { System.out.println(array[i]); }
		 */
		for(int i:array){
			System.out.println(i);
		}
	}

	/**
	 * 循环生成数组并赋值
	 * 
	 * @@param num
	 */
	public static int[] create(int num)
	{
		int[] array=new int[num];
		array[0]=2;
		array[1]=72;
		array[2]=63;
		array[3]=83432423;
		array[4]=123;
		array[5]=52;
		array[6]=22;
		array[7]=222;
		array[8]=12;
		array[9]=23;
		return array;
	}

	/**
	 * 比较相邻两个元素进行'冒泡'
	 * 
	 * @param array
	 * @return
	 */
	public static int[] sort(int[] array)
	{
		for(int out=array.length-1;out>0;out--){
			for(int in=0;in<out;in++){
				if(array[in]>array[in+1]){
					swap(array,in,in+1);
				}
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
	public static void swap(int[] array,int a,int b)
	{
		int temp=0;
		temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}
