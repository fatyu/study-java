package org.fatyu.bp;

/**
 * �������͵ĵ����ȸ�������ʾ��.
 * ��jdk1.5�Ժ����ʹ��16��������ʾ������.
 * ע��:�������Ͳ���������ڼ�����.���ڼ���ʹ��BigDecimal
 * @author Fatyu
 * @see java.math.BigDecimal --> {���ɱ�ġ����⾫�ȵ��з���ʮ������}
 */
public class FloatFoo {
    /**
     * Ĭ�Ϲ��췽��
     */
    public FloatFoo() {
        super();
    }

    /**
     *������
     * @param args
     */
    public static void main(String[] args) {
        float fi = 2.5f; //�����ȸ�������Ҫ��f����F����ʾ.û��f����F��Ĭ����˫����double����
        float fj = 3.5F;
        float add = fi + fj;
        float subtract = fi - fj;
        float multi = fi * fj;
        float divi = fi / fj;
        float model = fi % fj;
        System.out.println("�ӷ�:" + add);
        System.out.println("����:" + subtract);
        System.out.println("�˷�:" + multi);
        System.out.println("����:" + divi);
        System.out.println("��ģ:" + model);
    }
}
