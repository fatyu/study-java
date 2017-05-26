package cc.notalk.bp.ch03.interfac1;

public interface InterfaceTwo {
	/**
	 * 成员变量
	 */
	// 在interface中成员变量默认的为public static final修饰
	//也只能是public static final
	int i = 20;

	public static final int j = 20;

	/**
	 * 成员方法
	 * @@return 
	 */
	//默认的abstract public 修饰
	abstract public void method1();

	String method2();

}
