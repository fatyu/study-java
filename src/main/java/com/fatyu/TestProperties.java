package com.fatyu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {

		URL url = TestProperties.class.getClassLoader().getResource("test.doc");// 获得doc文件所在路径
		Properties p = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(url.getFile());
			p.load(is);
			String fuck = p.getProperty("fuck");
			System.err.println(fuck);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
