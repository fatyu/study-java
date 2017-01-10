package com.fatyu.ch08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 首先获得控制台输入的数据 创建日志文件 获得printwriter进行数据的输出
 * 
 * @@author Fatyu
 * @@Note 程序容易出现输入一次显示两次的问题--可能是由于输入法的问题
 */
public class LogOfPrintStream {

	public static void main(String[] args) {
		try {
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));// 通过bufferedReader获得控制台输入的每一行数据
			FileWriter fw = new FileWriter(new File("d:" + File.separator + "log.log"), true);// 创建日志文件并设置文件可追加数据
			PrintWriter pw = new PrintWriter(fw, true);// 将数据输出至日志文件并自动flush
			String s;
			// 阻塞式读取数据

			while ((s = bw.readLine()) != null) {
				if (s.equalsIgnoreCase("quit")) {
					break;
				} else {
					System.out.println(s.toUpperCase());
					pw.println(s);
				}
			}
			pw.println("------------------" + new Date() + "---------------------");
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
