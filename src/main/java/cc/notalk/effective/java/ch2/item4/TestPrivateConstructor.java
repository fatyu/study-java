package cc.notalk.effective.java.ch2.item4;

/**
 * <p>
 * NonInstantiability with a private constructor
 * </p>
 * 
 * <p>
 * Subclass Can't Instance too.
 * </p>
 * 
 * @author fatyu
 * 
 */
public class TestPrivateConstructor {

	/*
	 * 不提供public修饰的构造方法public TestPrivateConstructor(){}
	 */

	private TestPrivateConstructor() {// 使用private修饰构造方法
		// throw new AssertionError使得该class 不能实例化对象
		throw new AssertionError("Can't instance !!!");
	}

	static final private TestPrivateConstructor tpc = new TestPrivateConstructor();// 提供一个不可改变的静态对象

	public static TestPrivateConstructor getInstance() {// 提供一个共有方法返回一个对象
		return tpc;
	}
}
