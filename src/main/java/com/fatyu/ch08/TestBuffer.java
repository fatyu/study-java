package com.fatyu.ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * 使用BufferReader可以进行文件数据的一行读取
 * @@author Fatyu
 *
 */
public class TestBuffer {

	public static void main(String[] args) {
		File file = new File("d:/test.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {

			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter(file));

			for (int i = 0; i < 100; i++) {
				bw.write(i);
				bw.newLine();
			}
			bw.flush();//关闭资源前要进行缓冲器数据的刷新
			bw.close();//关闭输出流

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
