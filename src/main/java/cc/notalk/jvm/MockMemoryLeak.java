package cc.notalk.jvm;
import java.util.Vector;

/**
 * 模拟内存泄漏
 * @author fatyu
 */
public class MockMemoryLeak {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		java.util.Vector v = new java.util.Vector(10);
		for (int i = 0; i < 3000000; i++) {
			Object o = new Object();
			v.add(o);
			int hashCode = o.hashCode();
			o = null;//对象o的引用为空
			System.out.println("compare hashcode :" + hashCode + "====" + v.get(i - 1 >= 0 ? i - 1 : 0).hashCode());
			v.remove(v.firstElement());//删除vector对object的引用
			System.out.println(i);
		}
	}

}
