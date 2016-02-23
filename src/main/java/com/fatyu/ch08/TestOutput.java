package com.fatyu.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <b>字节流是以字节为单位进行读取-->出现中文乱码问题</b> <br>
 * <b>字符流是以字符为单位进行读取-->不出现中文乱码问题</b>
 * 
 * @@author Fatyu
 * 
 */
public class TestOutput {

	public static void main(String[] args) {
		File file = new File("e:/com/fatyu/ch08/TestInput.java");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int c;
		
		
		try {
			fis = new FileInputStream("src/com/fatyu/ch08/TestInput.java");
			fos = new FileOutputStream(file);
			while ((c = fis.read()) != -1) {
				System.out.print((char) c);
				fos.write((char) c);
			}
			fos.flush();//将输入流的数据进行刷新并强制写出所有的数据
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {

				fos.close();//关闭输入流
				fis.close();//关闭输出流
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
