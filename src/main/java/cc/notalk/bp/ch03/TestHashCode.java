package cc.notalk.bp.ch03;

public class TestHashCode {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			TestHashCode thc = new TestHashCode();
			System.out.println(thc.toString().substring(thc.getClass().getName().length() + 1));
		}

	}
}
