package cc.notalk.effective.java.ch3.item09;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();
		map.put(new PhoneNumber(110, 370, 3130), "fatyu");
		System.out.println(new PhoneNumber(110, 370, 3130));
		System.out.println(map.get(new PhoneNumber(110, 370, 3130)));
		System.out.println(new PhoneNumber(110, 370, 3130).equals(new PhoneNumber(110, 370, 3130)));
	}
}
