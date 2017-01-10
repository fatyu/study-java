package com.fatyu.ch06;

import java.io.File;

/**
 * 递归的列出文件目录
 * 
 * @author Fatyu
 * 
 */
public class FileList {
	public static void main(String[] args) {
		FileList fl = new FileList();
		File file = new File("D:/北京圣思园");//输出根目录
		System.out.println("|-" + file.getName());
		fl.listDirAndFile(file, 1);
	}

	/**
	 * 传递文件对象和级别进行递归输出子目录
	 * @param rootDir
	 * @param leave
	 */
	public void listDirAndFile(File rootDir, int leave) {

		String prefix = "|-";//前缀

		for (int i = 0; i < leave; i++) {
			prefix = " |" + prefix;
		}

		File[] files = rootDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(prefix + files[i].getName());
			if (files[i].isDirectory()) {
				listDirAndFile(files[i], ++leave);//注意使用++leave
			}

		}
	}
}
