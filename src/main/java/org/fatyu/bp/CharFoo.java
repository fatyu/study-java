package org.fatyu.bp;

/**
 * �������͵�char����ʾ��.
 * char���Ϳ�����unicode�����ʾ.
 * ��java�б���ʹ��char����,������ȷ��utf-16���뵥Ԫ�����޸�
 * @author Fatyu
 */
public class CharFoo {
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public CharFoo() {
		super();
	}

	/**
	 *������
	 * @param args
	 */
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'b';
		System.out.println((char) (c1 + c2));
		System.out.println(c1 + c2);
		System.out.println('\u2122');
	}
}
