package com.fatyu;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
		System.out.println("输入【-1】让系统退出......");
		String flag = new Scanner(System.in).nextLine().toString();

		while (!flag.equals("-1")) {
			System.out.println("输入【-1】让系统退出......");
			flag =new Scanner(System.in).nextLine().toString();
		}
		while (flag.equals("-1")) {
			System.out.println("系统成功退出！");
			System.exit(0);
		}

	}
}
