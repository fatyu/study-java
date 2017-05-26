package cc.notalk.bp.ch03.polyphony;

/**
 * 继承父类并重写父类的getInfo方法
 * 
 * @author fatyu
 * 
 */
public class Student extends Person {

	private String schoolName;

	/**
	 * 获得学校的名称
	 * 
	 * @@return schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * 设置学校的名称
	 * 
	 * @@param schoolName
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * 重写父类的getInfo方法并返回当前对象的信息
	 * 
	 * @@return info
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + "\nschoolName:" + schoolName;
	}
}
