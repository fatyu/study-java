package cc.notalk.bp.ch03.polyphony;

/**
 * 父类 用于引用子类并调用子类的特定方法
 * 
 * @author fatyu
 * 
 */
public class Person {

	private String name;
	private int age;
	private String address;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 返回当前对象的信息
	 * 
	 * @@return info
	 */
	public String getInfo() {
		return "name:" + name + "\nid:" + id + "\nage:" + age + "\naddress:" + address;
	}
}
