package cc.notalk.effective.java.ch3.item08;

/**
 * <li>Each instance of the class is inherently unique</li> equals
 * 使用的是"=="进行对象的比较 <blockquote> public boolean equals(Object obj) { <br>
 * return (this == obj); <br>
 * } </blockquote>
 * 
 * 
 * <p><li>引用类型比较的是内存地址</li>
 * <li>值类型比较的是内容</li></p>
 * @author fatyu
 * 
 */
public class TestEqualsMethod {

	public static void main(String[] args) {
		TestEqualsMethod tem1 = new TestEqualsMethod();
		TestEqualsMethod tem2 = new TestEqualsMethod();
		System.out.println(tem1.equals(tem2));
		System.out.println(tem1.equals(tem1));

		System.out.println("----------------test \"==\"--------------");

		System.out.println(tem1 == tem2);
		//System.out.println(tem1 == tem1);

		String s1 = "string_s";
		String s2 = "string_s";
		String s3 = new String("string_s");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("------------------------");

		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
	};
}
