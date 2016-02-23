package com.fatyu.ch08;

import java.io.FileInputStream;
import java.io.FileReader;

/**
 * <b>字节流是以字节为单位进行读取-->出现中文乱码问题</b> <br>
 * <b>字符流是以字符为单位进行读取-->不出现中文乱码问题</b>
 * 
 * @@author Fatyu
 * 
 */
public class TestInput {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileReader fr = null;
		long num = 0l;
		int c;
		try {
			fis = new FileInputStream("src/com/fatyu/ch08/TestInput.java");// 字节流
			fr = new FileReader("src/com/fatyu/ch08/TestInput.java");// 字符流

			while ((c = fis.read()) != -1) {
				System.out.print((char) c);
				num++;
			}
			System.out
					.println("===============================fis readed========================");
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			System.out
					.println("===============================fr readed========================");
			fis.close();
			System.out.println("文件大小为:" + num + "字节");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
