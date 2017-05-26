package cc.notalk.effective.java.ch2.item2;

public class TestBuilder {
	private String className;
	private String classType;
	private String classLife;
	private String classSize;

	/**
	 * 内部静态builder,进行对象的创建
	 * 
	 * 形成方法链,从而进行属性的赋值
	 * 
	 * @author fatyu
	 * 
	 */

	public static class BuilderInner {

		// 要求的属性构件时进行赋值
		private String className;
		private String classType;

		// 不要求的属性 赋以默认值
		private String classLife = "365 days";
		private String classSize = "Oh It's so big!";

		public BuilderInner(String className, String classType) {
			this.className = className;
			this.classType = classType;
		}

		public BuilderInner classLife(String classLife) {
			this.classLife = classLife;
			return this;
		}

		public BuilderInner classSize(String classSize) {
			this.classSize = classSize;
			return this;
		}

		public TestBuilder build() {
			return new TestBuilder(this);
		}

	}

	private TestBuilder(BuilderInner bi) {
		this.className = bi.className;
		this.classType = bi.classType;
		this.classLife = bi.classLife;
		this.classSize = bi.classSize;
	}

	public String getClassName() {
		return className;
	}

	public String getClassType() {
		return classType;
	}

	public String getClassLife() {
		return classLife;
	}

	public String getClassSize() {
		return classSize;
	}
}
