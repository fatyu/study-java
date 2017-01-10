package com.fatyu.annotation.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Test t = new Test();
		Class<Test> c = Test.class;
		Method method = c.getMethod("test", new Class[] {});

		if (method.isAnnotationPresent(AnnotationTest.class)) {
			method.invoke(t, new Object[] {});
			AnnotationTest annotationTest = method.getAnnotation(AnnotationTest.class);
			String s = annotationTest.s();
			String s1 = annotationTest.s1();
			System.out.println(s + "\n" + s1);
		}
	}
}
