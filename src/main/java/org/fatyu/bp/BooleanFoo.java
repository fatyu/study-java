package org.fatyu.bp;

/**
 * �������͵�boolean����
 * booleanֻ��true��false����ֵ.��Ҫ�����߼��ж�,��֮��ص���if while
 * @author ����
 */
public class BooleanFoo {
    /**
     * Ĭ�Ϲ��췽��
     */
    public BooleanFoo() {
        super();
    }

    /**
     *������
     * @param args
     */
    public static void main(String[] args) {
        boolean flag_true = true;
        boolean flag_false = false;
        if (flag_true)
            System.out.println("true");
        else if (flag_false)
            System.out.println("false");

        if (flag_false)
            System.out.println("true");
        else if (flag_true)
            System.out.println("false");
    }
}
