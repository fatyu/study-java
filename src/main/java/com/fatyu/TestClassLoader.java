package com.fatyu;

class ZY {
	private static ZY zy = new ZY();
	public static int a;
	public static int b = 0;

	public ZY() {
		a++;
		b++;
	}

	public static ZY getaaa() {

		return zy;
	}

}

public class TestClassLoader {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ZY zy = ZY.getaaa();
		System.out.println(zy.a);
		System.out.println(zy.b);
	}
}
