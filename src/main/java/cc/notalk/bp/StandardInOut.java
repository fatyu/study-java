package cc.notalk.bp;

import java.util.Scanner;

/**
 * 标准输入输出.
 * @author
 */
public class StandardInOut {
	/**
	 * 默认构造方法.
	 */
	public StandardInOut() {
		super();
	}

	/**
	 * 主方法.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input data is :" + sc.nextLine());
		sc.close();
	}
}
