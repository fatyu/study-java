package org.fatyu.bp;

/**
 * 基本类型的单精度浮点类型示例.
 * 在jdk1.5以后可以使用16进制来表示浮点数.
 * 注意:浮点类型不适用与金融计算中.金融计算使用BigDecimal
 * @author Fatyu
 * @see java.math.BigDecimal --> {不可变的、任意精度的有符号十进制数}
 */
public class FloatFoo {
    /**
     * 默认构造方法
     */
    public FloatFoo() {
        super();
    }

    /**
     *主方法
     * @param args
     */
    public static void main(String[] args) {
        float fi = 2.5f; //单精度浮点类型要加f或者F来表示.没有f或者F的默认是双精度double类型
        float fj = 3.5F;
        float add = fi + fj;
        float subtract = fi - fj;
        float multi = fi * fj;
        float divi = fi / fj;
        float model = fi % fj;
        System.out.println("加法:" + add);
        System.out.println("减法:" + subtract);
        System.out.println("乘法:" + multi);
        System.out.println("除法:" + divi);
        System.out.println("求模:" + model);
    }
}
