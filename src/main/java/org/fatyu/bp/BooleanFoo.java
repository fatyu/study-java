package org.fatyu.bp;

/**
 * 基本类型的boolean类型
 * boolean只有true和false两个值.主要用于逻辑判断,与之相关的有if while
 * @author 张羽
 */
public class BooleanFoo {
    /**
     * 默认构造方法
     */
    public BooleanFoo() {
        super();
    }

    /**
     *主方法
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
