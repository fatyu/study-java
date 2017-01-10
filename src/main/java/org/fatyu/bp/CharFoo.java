package org.fatyu.bp;

/**
 * 基本类型的char类型示例.
 * char类型可以用unicode编码表示.
 * 在java中避免使用char类型,除非明确对utf-16代码单元进行修改
 * @author Fatyu
 */
public class CharFoo {
	/**
	 * 默认构造方法
	 */
	public CharFoo() {
		super();
	}

	/**
	 *主方法
	 * @param args
	 */
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'b';
		System.out.println((char) (c1 + c2));
		System.out.println(c1 + c2);
		System.out.println('\u2122');
	}
}
