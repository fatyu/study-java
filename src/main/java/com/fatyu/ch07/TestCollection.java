package com.fatyu.ch07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection是list和set的父接口可以使用子类的对象引用
 * 
 * @@author Fatyu
 * 
 */
public class TestCollection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection c = new ArrayList();
		System.out.println(c.size());
		c.add("TestCollection");
		c.add(new Integer(20));
		c.add(new String("bye-bye Collection"));
		c.add((long) 1l);

		Iterator iterator = c.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(c.size());
		System.out.println(c);
	}
}
