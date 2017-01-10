package com.fatyu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	public Object copy(Object o) throws Exception {

		Class<?> classType = o.getClass();// o.getClass()效果等价于Person.class

		/**
		 * 通过classType的默认构造方法进行初始化一个对象也可使用classType.newInstance()
		 * 当没有默认的无参构造方法时只能使用getConstructor进行对象实例化
		 */

		Object copyPerson = classType.getConstructor(new Class[] {}).newInstance(new Object[] {});

		/**
		 * 获得Person类中的所有fields【数据属性】
		 */
		Field[] fields = classType.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			// 获得属性名称
			String fieldName = field.getName();

			// 进行属性名称的转换[将第一个字符转换成大写字符]
			String firstWord = fieldName.substring(0, 1).toUpperCase();
			String leftWords = fieldName.substring(1);
			StringBuffer sb = new StringBuffer();
			StringBuffer realName = sb.append(firstWord).append(leftWords);

			// 获得get和set方法的名字
			String get = "get" + realName;
			String set = "set" + realName;

			// 获得get方法
			Method getMethod = classType.getMethod(get, new Class[] {});
			// 获得set方法
			Method setMethod = classType.getMethod(set, new Class[] { field.getType() });

			Object value = getMethod.invoke(o, new Object[] {});
			System.out.println(fieldName + ":" + value.toString());

			setMethod.invoke(copyPerson, new Object[] { value });
		}

		return copyPerson;

	}

	public static void main(String[] args) throws Exception {
		Person p = new Person(21, "ranker");
		p.setId(new Long(1));
		Person p1 = (Person) new ReflectTest().copy(p);
		System.out.println(p1.getId() + " " + p1.getAge() + " " + p1.getName());
	}

}

class Person {

	public Person() {

	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private long id;
	private int age;
	private String name;
}
