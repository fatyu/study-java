package org.fatyu.bp;

/**
 * �������͵���������ʾ��. long byte short��ͬ��int ���ʱ��Ҫʹ��byte int long
 * ������ռ�ֽڲ���c++������ϵͳ.
 * @author Fatyu
 */
public class IntFoo {
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public IntFoo() {
		super();
	}

	/**
	 *������
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int add = i + j;
		int subtract = i - j;
		int multi = i * j;
		int divi = i / j;
		int model = i % j;
		System.out.println("�ӷ�:" + add);
		System.out.println("����:" + subtract);
		System.out.println("�˷�:" + multi);
		System.out.println("����:" + divi);
		System.out.println("��ģ:" + model);

	}
}
