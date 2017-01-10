package com.effective.ch2.item5;

/**
 * 通过自动封箱和自动拆箱来解释非必须对象创建的缺点
 * 
 * <li>Long -> long 消耗运行时间</li>
 * 
 * @@author Fatyu
 * 
 */
public class TestUnBoxingAndBoxing {
	public static void main(String[] args) {
		Long sum = new Long(0l);
		for (long i = 0l; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
		System.out.println("====================================");

		Long sum1 = 0l;
		for (long i = 0l; i < Integer.MAX_VALUE; i++) {
			sum1 += i;
		}
		System.out.println("sum1:" + sum1);
		System.out.println("====================================");

		long sum2 = 0l;
		for (long i = 0l; i < Integer.MAX_VALUE; i++) {
			sum2 += i;
		}
		System.out.println("sum2:" + sum2);
		System.out.println("====================================");

	}
}
