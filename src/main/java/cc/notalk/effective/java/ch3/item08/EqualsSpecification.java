package cc.notalk.effective.java.ch3.item08;

/**
 * <li>1. Reflexive: An Object must be equal to itself.</li> <li>2. Symmetry:
 * Any two Objects must agree on whether they are equal.</li> <li>3.
 * Transitivity:X == Y && Y ==Z => Z==X</li> <li>4. Consistency: if X==Y all the time X==Y</li>
 * <li>5. Non-nullity: null is not a Object! So Object==null is false</li>
 * @author fatyu
 * 
 */
public class EqualsSpecification {

	public static void main(String[] args) {
		UnFriendlyString ufs = new UnFriendlyString("fatyu");
		String fatyu = "fatyu";
		System.out.println(ufs.equals(fatyu));
		System.out.println(fatyu.equals(ufs));
	}
}

class UnFriendlyString {
	private String s;// 声明一个字符串

	public UnFriendlyString(String s) {
		if (s == null) {
			throw new RuntimeException("字符串不能为空...");
		} else {
			this.s = s;
		}
	}

	@Override
	public boolean equals(Object o) {
		// if (o instanceof UnFriendlyString) {// 对O进行类型判断
		// return s.equalsIgnoreCase(((UnFriendlyString) o).s);// 调用字符串的比较方法
		// }
		//
		// if (o instanceof String) {
		// return s.equalsIgnoreCase((String) o);
		// }
		// return false;
		return o instanceof UnFriendlyString && ((UnFriendlyString) o).s.equalsIgnoreCase(s);
	}
}
