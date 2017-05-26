package cc.notalk.effective.java.ch2.item3;

/**
 * <p>Intrinsically unique-->Just like the Recycle Bin of Windows System.</p>
 * 
 * <p>1. Constructor private</p>
 * 
 * <p>2. Exporting a public static member</p>
 * 
 * <p>3. Can't reInstance by reflection</p>
 * 
 * @author fatyu
 * 
 */
public class TestSinglton {

	// 提供一个私有的构造方法 但是客户端可以通过AccessObject.setAccessible()进行创建对象【反射技术】
	private TestSinglton() {
	}

	private static final TestSinglton TS_INSTANCE = new TestSinglton();// 提供一个不可改变的对象

	public static TestSinglton getInstance() {// 静态工厂方法
		return TS_INSTANCE;
	}

}
