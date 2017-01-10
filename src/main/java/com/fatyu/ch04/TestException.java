package com.fatyu.ch04;

public class TestException {

	public static void main(String[] args) {
		try {
			System.out.println("try line1");
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
	}
}
