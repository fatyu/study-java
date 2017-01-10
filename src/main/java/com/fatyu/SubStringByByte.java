package com.fatyu;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @@author Fatyu
 * 
 */
public class SubStringByByte {

	public static void main(String[] args) throws Exception {
		System.out.println(subStringWithByte("From张羽", 5));
	}

	/**
	 * 根据字节长度截取字符串
	 * 
	 * @@param string
	 * @@param length
	 * @@return new String();
	 */
	public static String subStringWithByte(String string, int length) {

		// 获得字节数组
		byte[] bytes = null;
		// 标记字节数组的当前位置
		int index = 2;
		// 标记截取几个字节
		int cutNum = 0;

		// 首先获得以Unicode字符集编码的字节数组 一个汉字两个字节 其他字符逻辑意义上占一个字节[第一个为0 第二个不为0]
		try {
			bytes = string.getBytes("Unicode");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// for循环用来确定截取位置index
		for (; index < bytes.length && cutNum < length; index++) {
			if (index % 2 == 1) {
				cutNum++;
			} else {
				if (bytes[index] != 0) {
					cutNum++;
				}
			}
		}
		//判断截取位置是不是为奇数并且根据奇数位的值确定截取位置
		if (index % 2 == 1) {
			if (bytes[index] == 0) {
				index = index + 1;
			} else {
				index = index - 1;
			}
		}

		try {
			return new String(bytes, 0, index, "Unicode");//使用unicode编码创建一个新的字符串
		} catch (UnsupportedEncodingException e) {
			return "截取文本失败";
		}
	}

}
