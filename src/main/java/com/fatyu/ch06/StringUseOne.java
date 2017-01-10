package com.fatyu.ch06;

/**
 * 简单的计算字符串中出现大写字母 小写字母 非字母的个数
 * @@author Fatyu
 *
 */
public class StringUseOne {
	public static void main(String[] args) {
		String s = "dsajgdsjkahdjk7826389w890@@$%ASDASDAS^&";

		int upper = 0;
		int lower = 0;
		int other = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				upper++;
			} else if (c >= 'a' && c <= 'z') {
				lower++;
			} else {

				other++;
			}
		}

		System.out.println("Upper:\t" + upper + "\n" + "Lower:\t" + lower + "\n" + "Other:\t" + other);
	}
}
