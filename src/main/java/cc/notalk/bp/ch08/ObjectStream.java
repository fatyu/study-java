package cc.notalk.bp.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:/test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new TestForObjectStream("fatyu"));
			oos.writeObject(new TestForObjectStream("zhangyu"));
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream("d:/test.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			TestForObjectStream tfos = (TestForObjectStream) ois.readObject();
			TestForObjectStream tfos2 = (TestForObjectStream) ois.readObject();

			System.out.println(tfos.name + "\n" + tfos.age + "\n" + tfos.leave + "\n" + tfos.studyCourse + "\n");
			System.out.println(tfos2.name + "\n" + tfos2.age + "\n" + tfos2.leave + "\n" + tfos2.studyCourse + "\n");

			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestForObjectStream implements Serializable {
	private static final long serialVersionUID = -1378274037093754064L;

	public TestForObjectStream(String name) {
		this.name = name;
	}

	transient int age = 21;//
	String name = "fatyu";
	String leave = "FreshBird";
	String studyCourse = "Thinking in Java";
}
