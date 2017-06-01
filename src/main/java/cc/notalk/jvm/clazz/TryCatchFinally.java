package cc.notalk.jvm.clazz;

public class TryCatchFinally {

	public int extracted() {
		int x;
		try {
			x = 1;
		} catch (final Exception e) {
			x = 2;
		} finally {
			x = 3;
		}
		return x;
	}
}
