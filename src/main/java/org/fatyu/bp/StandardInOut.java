package org.fatyu.bp;

import java.util.Scanner;

/**
 * ��׼�������.
 * @author
 */
public class StandardInOut {
	/**
	 * Ĭ�Ϲ��췽��.
	 */
	public StandardInOut() {
		super();
	}

	/**
	 * ������.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input data is :" + sc.nextLine());
		sc.close();
	}
}
