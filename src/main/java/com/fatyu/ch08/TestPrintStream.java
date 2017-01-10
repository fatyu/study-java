package com.fatyu.ch08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 设置输出对象位置 可用来记录日志
 * @@author Fatyu
 *
 */
public class TestPrintStream {
	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);

			System.setOut(ps);// 设置输出的对象
			for (char i = 0; i < 65535; i++) {
				System.out.print(i);
				int ln = 0;
				if (ln++ > 100) {
					System.out.println();
					ln = 0;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
