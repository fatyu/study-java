package org.fatyu.string;

/**
 * 代码点:java字符串是由char序列组成,String.length()获得字符串所需要的代码点数量.
 * <br/>
 * 获取字符串实际长度使用<code>codePointCount(0，str.length())</code>获得<br/>
 * 获取指定位置的char值<code>charAt(n)</code>是获得位置为n的代码单元 指char值<br/>
 * 获取指定位置的unicode字符值<code>codePointAt()</code>是获得代码点.指unicode的字符<br/>
 * @author 张羽
 * @version 1.0
 */
public class CodePointFoo {
	public CodePointFoo() {
		super();
	}

	/**
	 * 程序入口-main方法.
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "zhangyu";
		System.out.println(str);
		int codepoint = str.codePointAt(2);
		int tureLength = str.codePointCount(0, str.length());
		System.out.println("unicode is " + codepoint);
		System.out.println(tureLength);
	}
}
