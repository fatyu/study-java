package cc.notalk.bp.ch06;

public class StringUseTwo {
	public static void main(String[] args) {
		// 统计字符串指定字符串出现的次数
		String s = "zhangyuxiaoyufatyubigfatyulittlefatyu";

		int count = 0;// 记录出现的次数

		int index = -1;// index表示待更新索引位置
		String goal = "yu";

		while ((index = s.indexOf("yu")) != -1) {
			index += goal.length();
			s = s.substring(index);
			count++;
		}
		System.out.println(count);
	}
}
