package com.fatyu.ch06;

import java.io.File;
import java.io.IOException;
/**
 * 创建指定文件名称的目录
 * @@author Fatyu
 *
 */
public class CreateDir {

	/**
	 * @@param args
	 * @@throws IOException
	 */
	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 20; i++) {
			if(i<=9){
				File file = new File("e:"+File.separator+"SE"+File.separator+"ch0"+i);
				file.mkdir();
			}else{
				File file = new File("e:"+File.separator+"SE"+File.separator+"ch"+i);
				file.mkdir();
			}
		}
	}

}

