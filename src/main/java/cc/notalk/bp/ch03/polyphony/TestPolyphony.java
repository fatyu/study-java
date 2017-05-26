package cc.notalk.bp.ch03.polyphony;

/**
 * 测试多态
 * 
 * @author fatyu
 * 
 */
public class TestPolyphony {

	/**
	 * @@param args
	 */
	public static void main(String[] args) {

		// 设置个人信息
		Person person = new Person();
		person.setId("412326198711190010");
		person.setName("fatyu");
		person.setAddress("From China");
		person.setAge(21);

		// 设置学生信息
		Student student = new Student();
		student.setId("412326198711190010");
		student.setName("fatyu");
		student.setAddress("From China");
		student.setAge(21);
		student.setSchoolName("XJ_University");

		// 设置老师信息
		Teacher teacher = new Teacher();
		teacher.setId("412326198711190010");
		teacher.setName("fatyu");
		teacher.setAddress("From China");
		teacher.setAge(21);
		teacher.setTitle("Professior Yu");

		//输出个人信息
		System.out.println("Person Infomation:");
		System.out.println(person.getInfo() + "\n");

		//使用父类引用子类对象 输出Student的信息
		person = student;
		System.out.println("Student Infomation:");
		System.out.println(person.getInfo() + "\n");
		;

		//使用父类引用子类对象 输出Teacher的信息
		person = teacher;
		System.out.println("Teacher Infomation:");
		System.out.println(person.getInfo() + "\n");
	}
}
