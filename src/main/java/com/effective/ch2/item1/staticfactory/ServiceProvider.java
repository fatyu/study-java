package com.effective.ch2.item1.staticfactory;

/**
 * Service Provider
 * 
 * 服务创建接口
 * 
 * 类似于JDBC中的Driver接口
 * 
 * @@author Fatyu
 */
public interface ServiceProvider {
	public Service newService();// 返回一个服务对象
}
