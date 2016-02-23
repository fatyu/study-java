package com.effective.ch2.item1;

/**
 * Consider static factory methods instead of constructors
 * 
 * @@author Fatyu
 */
public class StaticFactoryMethod {
	public static void main(String[] args) {
		Person student1 = Student.getOneStudent();
		Student student2 = (Student)Student.getOneStudent();
		System.out.println(student1.equals(student2));
		System.out.println(student1 == student2);
		System.out.println(student1.say("no say1"));
		System.out.println(student2.say1("converted can use say1"));
	}
}

interface Person {//service interface

	public String say(String word);
}

class Student implements Person {//service implement
	private Student() {// 默认的构造方法

	}

	private static Student student = new Student();

	/**
	 * Advantage:
	 * 
	 * 1. they have names
	 * 
	 * 2. not required to create a new object each time
	 * 
	 * 3. return an object of any subtype of their return type
	 * 
	 * 4. reduce the verbosity of creating parameterized type instances
	 * 
	 * @@return ANY_TYPE
	 */
	/**
	 * Disadvantage:
	 * 
	 * 1. classes  without  public  or  protected  constructors  cannot  be  subclassed
	 * 
	 * 2. they  are  not readily distinguishable from other static methods
	 * 		But you can adhering to common convention
	 * 		[valueOf|of|newInstance|getInstance|newType|getType]
	 */
	public static Person getOneStudent() {// 使用静态工厂方法返回实例对象//access api
		return student;
	}

	public static Student[] getTwoStudent() {// 使用静态工厂方法返回两个实例对象
		return new Student[] { student, student };
	}

	@Override
	public String say(String word) {
		return word;
	}

	public String say1(String word) {
		return word;
	}
}
