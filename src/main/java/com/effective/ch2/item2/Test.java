package com.effective.ch2.item2;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TestBuilder tb = new TestBuilder.BuilderInner("testName", "testType").classLife("365 days")
				.classSize("oh it is so big").build();
		System.out.println(tb.getClassName() + "\t" + tb.getClassType());

		Class<TestBuilder> clazz = null;

		try {
			clazz = (Class<TestBuilder>) Class.forName("com.effective.item2.TestBuilder");// class.forName方法必须提供完整的类结构名称并且类必须有一个默认的构造方法
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		TestBuilder tb1;
		try {
			tb1 = (TestBuilder) clazz.newInstance();
			tb1.getClassName();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
