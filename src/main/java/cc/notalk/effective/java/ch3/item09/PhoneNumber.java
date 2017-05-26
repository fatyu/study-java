package cc.notalk.effective.java.ch3.item09;

/**
 * <blockquote>重写equals方法必须重写hashcode() 用于提高HashTable的性能 </blockquote>
 * 
 * @author fatyu
 * 
 */
public final class PhoneNumber {
	private short areaCode;
	private short prefix;
	private short lineNumber;

	/**
	 * 构造方法
	 * 
	 * @@param i
	 * @@param j
	 * @@param k
	 */
	public PhoneNumber(int i, int j, int k) {
		rangeCheck(i, 999, "AreaCode");
		rangeCheck(j, 999, "Prefix");
		rangeCheck(k, 9999, "LineNumber");

		this.areaCode = (short) i;
		this.prefix = (short) j;
		this.lineNumber = (short) k;
	}

	// 判断电话的范围
	private static void rangeCheck(int ranger, int max, String name) {
		if (ranger < 0 || ranger > max) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * 重写equals方法
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof PhoneNumber)) {
			return false;
		}

		PhoneNumber pn = (PhoneNumber) obj;

		return this.areaCode == pn.areaCode && this.prefix == pn.prefix && this.lineNumber == pn.lineNumber;
	}

	/**
	 * 重写hashcode方法
	 */
	private volatile int hashCode;

	// 延迟初始化hashcode

	@Override
	public int hashCode() {
		if (hashCode == 0) {
			hashCode = 47;
			hashCode = hashCode + 31 * this.areaCode;
			hashCode = hashCode + 31 * this.prefix;
			hashCode = hashCode + 31 * this.lineNumber;
		}

		return hashCode;
	}

	// @@Override
	// public int hashCode() {
	// int result = 47;
	// result = result + 31* this.areaCode;
	// result = result + 31* this.prefix;
	// result = result + 31* this.lineNumber;
	// return (int) result;
	// }

}
