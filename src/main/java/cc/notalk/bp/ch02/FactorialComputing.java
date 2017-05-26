package cc.notalk.bp.ch02;

public class FactorialComputing {

	public static void main(String[] args) {
		System.out.println(factorialComputing(4, 3));
	}

	/**
	 * 计算从start到end的常数的阶乘
	 * @@param start
	 * @@param end
	 * @@return
	 */

	public static long factorialComputing(int start, int end) {

		long startResult = 1l;//定义初始值为1
		long endResult = 1l;//定义初始值为1
		long tempStart = 0l;
		long tempEnd = 0l;

		for (int i = 1; i <= end; i++) {
			endResult *= i;//计算阶乘
			tempEnd += endResult;//计算阶乘和
		}

		if (start > 1 && end >= start) {
			for (int i = 1; i <= start; i++) {
				startResult *= i;//计算阶乘
				tempStart += startResult;//计算阶乘和
			}

			return tempEnd - tempStart;
		} else if (end < start) {
			return -1l;
		} else {
			return tempEnd;
		}
	}
}
