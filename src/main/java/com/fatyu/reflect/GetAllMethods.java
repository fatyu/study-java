package com.fatyu.reflect;

import java.lang.reflect.Method;

/**
 * 动态获得控制台输入的类的所有方法
 * 注意 【所有的反射必须是使用在运行时环境】
 * @@author Fatyu
 * 
 */
public class GetAllMethods {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length <= 0) {
			args = new String[1];
			args[0] = "java.util.LinkedList";
		}
		Class<?> classType = Class.forName(args[0].toString());
		Method[] methods = classType.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.toGenericString());
		}
	}
}
