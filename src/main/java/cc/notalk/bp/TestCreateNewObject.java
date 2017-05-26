package  cc.notalk.bp;

public class TestCreateNewObject {
	public static void main(String[] args) {
		OneObject oo = new OneObject("Use New KeyWord");
		System.out.println(oo.hashCode());

		try {
			@SuppressWarnings("rawtypes")
			Class ooClass = Class.forName("cc.notalk.OneObject");
			try {
				OneObject oo1 = (OneObject) ooClass.newInstance();
				System.out.println(oo1.hashCode());

			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			OneObject oo2 = (OneObject) oo.clone();
			System.out.println(oo2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class OneObject implements Cloneable {

	public OneObject() {
	}

	public OneObject(String str) {
		System.out.println(str);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
