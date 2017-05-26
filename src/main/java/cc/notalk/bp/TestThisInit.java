package  cc.notalk.bp;

public class TestThisInit {

	private int num;
	private String str;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public TestThisInit() {
		this(1);// 调用TestInit(int num)
		System.out.println("()");
	}

	public TestThisInit(int num) {
		this.num = num;
		System.out.println("(num)");
	}

	public TestThisInit(String str) {
		this();// 先调用默认构造函数
		this.str = str;
		System.out.println("(str)");
	}

	public static void main(String[] args) {
		TestThisInit ti1 = new TestThisInit();
		ti1.toString();
		TestThisInit ti2 = new TestThisInit(1);
		ti2.toString();
		TestThisInit ti3 = new TestThisInit("fatyu");
		ti3.toString();
	}
}
