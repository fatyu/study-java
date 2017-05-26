package cc.notalk.effective.java.ch3.item11;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Text t = new Text("标题", "内容");
		System.out.println(t.clone());
		Text t2 = (Text) t.clone();
		System.out.println(t2);
		Text t3 = (Text) t.clone();
		System.out.println(t3);
		System.out.println(t == t2);
		System.out.println(t == t3);
		System.out.println(t3 == t2);
		System.out.println(t3.equals(t2));
		System.out.println(t3.equals(t));
		System.out.println(t.clone().equals(t));//克隆的对象和源对象是两个不同的对象.
	}

}
