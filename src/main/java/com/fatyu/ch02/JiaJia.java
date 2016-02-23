package com.fatyu.ch02;

public class JiaJia {
	public static void main(String[] arg) {
		System.out.println(f(20));

	}

	public static long f(long n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return f(n - 2) + f(n - 1);

	}

}