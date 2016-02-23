package org.fatyu.bp;

/**
 * 变量的使用
 *   <li>数字.字母.下划线.或者Unicode的编码.$</li>
 *   <li>并且以字母或下划线或$开头.</li>
 *   <li>长度无限制.</li>
 *   <li>不能使用java关键字</li>
 * @author Fatyu
 */
public class VariableFoo {
    /**
     * 默认构造方法
     */
    public VariableFoo() {
        super();
    }

    /**
     *主方法
     * @param args
     */
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        int a; //变量a 只被声明,没有被初始化(赋值);
        int b = 0; //变量b,被声明同时赋值为0
        //int goto =0; 因为goto是关键字.所以此语句会报编译时错误
        //int 123 = 0;因为变量开头是数字.所以此语句会报编译时错误
    }
}
