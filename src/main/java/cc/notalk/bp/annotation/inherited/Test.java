package cc.notalk.bp.annotation.inherited;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {
		Class<Child> c = Child.class;
		Method method = c.getMethod("test", new Class[] {});

		if (c.isAnnotationPresent(InheritedTest.class)) {
			InheritedTest inheritedTest = c.getAnnotation(InheritedTest.class);
			String s = inheritedTest.s();
			System.out.println(s);
		}

		if (method.isAnnotationPresent(InheritedTest.class)) {
			InheritedTest inheritedTest = method.getAnnotation(InheritedTest.class);
			String s = inheritedTest.s();
			System.out.println(s);
		}
	}

}
