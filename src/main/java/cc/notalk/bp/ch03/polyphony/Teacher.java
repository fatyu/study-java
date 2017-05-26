package cc.notalk.bp.ch03.polyphony;

/**
 * 继承父类并重写父类的getInfo方法
 * 
 * @author fatyu
 * 
 */
public class Teacher extends Person {

	private String title;

	/**
	 * 获得老师的职称
	 * 
	 * @@return schoolName
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置老师的职称
	 * 
	 * @@param schoolName
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 重写父类的getInfo方法并返回当前对象的信息
	 * 
	 * @@return info
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + "\ntitle:" + title;
	}
}
