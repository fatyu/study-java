package cc.notalk.bp;

/**
 * 基本类型的单精度浮点类型示例.
 * 在jdk1.5以后可以使用16进制来表示浮点数.
 * 注意:浮点类型不适用与金融计算中.金融计算使用BigDecimal
 * @author fatyu
 * @see java.math.BigDecimal --> {不可变的、任意精度的有符号十进制数}
 */
public class DoubleFoo {
	/**
	 * 默认构造方法
	 */
	public DoubleFoo() {
		super();
	}

	/**
	 *主方法
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
		System.out.println("加法:" + add);
		System.out.println("减法:" + subtract);
		System.out.println("乘法:" + multi);
		System.out.println("除法:" + divi);
		System.out.println("求模:" + model);
	}
}
