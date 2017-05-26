package cc.notalk.bp;

/**
 * 操作符
 * @author fatyu
 */
public class OperatorFoo {
	/**
	 * 默认构造方法
	 */
	public OperatorFoo() {
		super();
	}

	/**
	 *主方法
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 3;
		int j = 5;
		//+ - * / %
		System.out.println("i+j:" + (i + j));
		System.out.println("i-j:" + (i - j));
		System.out.println("i*j:" + (i * j));
		System.out.println("i/j:" + (i / j));
		System.out.println("i%j:" + (i % j));
		//-= += *= %= /=
		System.out.println("i+=j:" + (i += j));
		System.out.println("i-=j:" + (i -= j));
		System.out.println("i*=j:" + (i *= j));
		System.out.println("i/=j:" + (i /= j));
		System.out.println("i%=j:" + (i %= j));
		//-- ++
		System.out.println("i++:" + (i++));
		System.out.println("++i:" + (++i));
		System.out.println("i--:" + (i--));
		System.out.println("--i:" + (--i));
		System.out.println("--i:" + (--i));
		//< > <= >= == !=
		System.out.println(i > j);
		System.out.println("++i:" + (++i));
		System.out.println("i--:" + (i--));
		System.out.println("--i:" + (--i));
		System.out.println("--i:" + (--i));
		//&& || -->会导致短路
		System.out.println("true && false: " + (true && false));
		System.out.println("false && false: " + (false && false));
		System.out.println("true && true: " + (true && true));
		System.out.println("false && true: " + (false && true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || false: " + (false || false));
		System.out.println("true || true: " + (true || true));
		System.out.println("false || true: " + (false || true));
		//& | 逻辑判断-->不会导致短路 与操作 或操作
		System.out.println("true & false: " + (true & false));
		System.out.println("false & false: " + (false & false));
		System.out.println("true & true: " + (true & true));
		System.out.println("false & true: " + (false & true));
		System.out.println("true | false: " + (true | false));
		System.out.println("false | false: " + (false | false));
		System.out.println("true | true: " + (true | true));
		System.out.println("false | true: " + (false | true));
		System.out.println("i & j:" + (i & j));
		System.out.println("i | j:" + (i | j));
		//?:
		System.out.println(i < j ? "i<j" : "i>=j");
		//^ ` << >>
		System.out.println("~i:" + ~i);
		System.out.println("^i:" + (2 ^ i));
		System.out.println("i <<:" + (i << 2));
		System.out.println("i >>:" + (i >> 2));
		System.out.println("i >>>:" + (i >>> 2));
		//! 非
		System.out.println(!true);
		System.out.println(!false);

	}
}
