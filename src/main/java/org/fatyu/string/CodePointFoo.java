package org.fatyu.string;

/**
 * �����:java�ַ�������char�������,String.length()����ַ�������Ҫ�Ĵ��������.
 * <br/>
 * ��ȡ�ַ���ʵ�ʳ���ʹ��<code>codePointCount(0��str.length())</code>���<br/>
 * ��ȡָ��λ�õ�charֵ<code>charAt(n)</code>�ǻ��λ��Ϊn�Ĵ��뵥Ԫ ָcharֵ<br/>
 * ��ȡָ��λ�õ�unicode�ַ�ֵ<code>codePointAt()</code>�ǻ�ô����.ָunicode���ַ�<br/>
 * @author ����
 * @version 1.0
 */
public class CodePointFoo {
	public CodePointFoo() {
		super();
	}

	/**
	 * �������-main����.
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
