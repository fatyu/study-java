package cc.notalk.jvm.clazz;

public class ClazzInfos {

	public static void main(String[] args) {
		String str = "hw";
		System.out.println(str);

		@SuppressWarnings("unused")
		String strOver64K = "64k";//当变量名称长度大于64K时,java文件不会被编译成class文件
	}
}
