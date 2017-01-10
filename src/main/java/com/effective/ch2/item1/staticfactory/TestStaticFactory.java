package com.effective.ch2.item1.staticfactory;

public class TestStaticFactory {

	/**
	 * @@param args
	 */
	public static void main(String[] args) {

		//生成一个provider
		ServiceProvider sp = new ServiceProviderImpl();

		//向manager中注册provider
		ServiceManager.regDefaultProvider(sp);

		//获得一个serviceImpl对象 【面向接口编程】
		Service s = ServiceManager.getService();
		((ServiceImpl) s).service1();
	}
}
