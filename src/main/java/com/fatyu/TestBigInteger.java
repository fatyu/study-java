package com.fatyu;

import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("输入要选择数字的个数:");
		int gs = in.nextInt();

		System.out.println("输入备选数字的总数：");
		int an = in.nextInt();

		BigInteger result = BigInteger.valueOf(1);

		for (int i = 1; i <= gs; i++) {
			result = result.multiply(BigInteger.valueOf(an - i + 1)).divide(
					BigInteger.valueOf(i));
		}
		System.out.println("结果是：" + result);
	}
}
