package org.fatyu.bp;

/**
 * �������͵ĵ����ȸ�������ʾ��.
 * ��jdk1.5�Ժ����ʹ��16��������ʾ������.
 * ע��:�������Ͳ���������ڼ�����.���ڼ���ʹ��BigDecimal
 * @author Fatyu
 * @see java.math.BigDecimal --> {���ɱ�ġ����⾫�ȵ��з���ʮ������}
 */
public class DoubleFoo {
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public DoubleFoo() {
		super();
	}

	/**
	 *������
	 * @param args
	 */
	public static void main(String[] args) {
		double fi = 2.5;
		double fj = 3.5;
		double add = fi + fj;
		double subtract = fi - fj;
		double multi = fi * fj;
		double divi = fi / fj;
		double model = fi % fj;
		System.out.println("�ӷ�:" + add);
		System.out.println("����:" + subtract);
		System.out.println("�˷�:" + multi);
		System.out.println("����:" + divi);
		System.out.println("��ģ:" + model);
	}
}
