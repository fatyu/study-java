package com.fatyu;

public class WhileFoo {
	public static void main(String[] args) {
		int i = 6, j = 6;
		do {
			System.out.println("i:"+i);
			i++;
		} while (i <= 5);
		while (j <= 5) {

			System.out.println("j:"+j);
			j++;
		}
	}
}
