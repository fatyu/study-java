package  cc.notalk.bp;

public class TestThis {
	public static void main(String[] args) {
		ThisClass tc = new ThisClass("ranker", 21);
		tc.returnInfo();
	}
}

class ThisClass {
	private String name;
	private int age;

	public ThisClass() {
	}

	/**
	 * this表示自身类的构造方法
	 * 
	 * @@param name
	 */
	public ThisClass(String name) {
		this();
	}

	public ThisClass(String name, int age) {
		this(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	/**
	 * this表示调用此方法的那个对象
	 * 
	 * @@param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * this表示调用此方法的那个对象
	 * 
	 * @@return
	 */
	public String returnInfo() {
		return this.getName() + this.getAge();
	}
}
