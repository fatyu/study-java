package com.fatyu.ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 使用接口进行父类调用子类对象
 * 
 * @@author Fatyu
 * 
 */
public class TestSet {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		// 三次添加只会添加一次 因为set是不可重复 
		set.add(111);
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		set.add(123);
		set.add(456);
//输出结果无顺序【进行复制时不是按照数组的顺序进行赋值的】
		Iterator<Object> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
