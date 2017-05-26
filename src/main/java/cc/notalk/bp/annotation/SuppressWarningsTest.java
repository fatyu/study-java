package cc.notalk.bp.annotation;

import java.util.Date;

public class SuppressWarningsTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toLocaleString());
	}
}
