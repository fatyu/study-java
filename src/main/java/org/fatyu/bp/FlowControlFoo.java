package org.fatyu.bp;

/**
 * ���̿���
 * @author fatyu
 */
public class FlowControlFoo {
    /**
     * Ĭ�Ϲ��캯��.
     */
    public FlowControlFoo() {
        super();
    }

    /**
     *������
     * @param args
     */
    public static void main(String[] args) {
        testFor();
    }


    /**
     * for Foo
     */
    public static void testFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Now is : " + i);
        }
    }

    /**
     * do while Foo.
     */
    public static void testDoWhile() {
        int flag = 0;
        do {
            flag += 1;
            System.out.println(flag);
        } while (flag < 10);
    }

    /**
     * while do Foo.
     */
    public static void testWhileDo() {
        int flag = 0;
        while (flag < 10) {
            flag += 1;
            System.out.println(flag);
        }

    }

    /**
     * Switch Foo.ע�⴩͸����
     */
    public static void testSwitch() {
        int flag = 3;
        switch (flag) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4:
            System.out.println("4");
            break;
        case 5:
            System.out.println("5");
            break;
        }

    }


}
