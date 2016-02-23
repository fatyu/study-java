package com.fatyu.ch05;

/**
 * 面向过程的方式
 * 
 * @@使用数组构建一个双向循环链表
 * @@author Fatyu
 * 
 */
public class ThreeQuit {
	public static void main(String[] args) {
		// 初始化数组
		boolean[] kids = new boolean[100];

		for (int i = 0; i < kids.length; i++) {
			kids[i] = true;// 使用true表示kids在圆上
		}

		int flag = 0;// 记录循环数目(<=3)

		int kidsOnLength = kids.length;// 记录还在圆上的小孩个数

		int currentKid = 0;// 记录当前小孩的编号

		while (kidsOnLength > 1) {
			if (kids[currentKid] == true) {
				flag++;
				if (flag == 3) {
					kids[currentKid] = false;// 置为false表示不在圆上
					kidsOnLength--;
					flag = 0;// 复位 重新计数
				}
			}

			currentKid++;

			if (currentKid == kids.length) {
				currentKid = 0;
			}
		}

		for (int i = 0; i < kids.length; i++) {
			if (kids[i] == true) {
				System.out.println("第" + (i + 1) + "个小孩会最终留下...");
			}
		}

	}
}
