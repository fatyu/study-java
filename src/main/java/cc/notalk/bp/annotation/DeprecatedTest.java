package cc.notalk.bp.annotation;

import java.util.Date;

/**
 *
 * @author fatyu
 *
 */
public class DeprecatedTest {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toLocaleString());
		deprecatedTest();
	}

	@Deprecated
	public static void deprecatedTest() {
		System.out.println("测试...");
	}
}
