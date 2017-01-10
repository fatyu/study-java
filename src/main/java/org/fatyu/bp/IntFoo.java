package org.fatyu.bp;

/**
 * 基本类型的整数类型示例. long byte short等同于int 编程时主要使用byte int long
 * 整数所占字节不像c++依赖于系统.
 * @author Fatyu
 */
public class IntFoo {
	/**
	 * 默认构造方法
	 */
	public IntFoo() {
		super();
	}

	/**
	 *主方法
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int add = i + j;
		int subtract = i - j;
		int multi = i * j;
		int divi = i / j;
		int model = i % j;
		System.out.println("加法:" + add);
		System.out.println("减法:" + subtract);
		System.out.println("乘法:" + multi);
		System.out.println("除法:" + divi);
		System.out.println("求模:" + model);

	}
}
