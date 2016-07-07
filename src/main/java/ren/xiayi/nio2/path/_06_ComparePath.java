package ren.xiayi.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * path对象比较只是比较路径而不是真实文件的比较
 * @author fatyu
 */
public class _06_ComparePath {
	public static void main(String[] args) {

		//比较两个不存在文件
		Path path1 = Paths.get("D:\\file1");
		Path path2 = Paths.get("D:\\file2");
		boolean equalsResult = path1.equals(path2);
		System.out.println("path1 is equal path2? result is :" + equalsResult);//文件不存在

		//compare算法
		int compareTo = path1.compareTo(path2);//比较算法基于字典(lexicographically)
		assert compareTo > 0;//运行时开启断言  -ea
		System.out.println("文件路径比较file1?file2:" + compareTo);

		//除此之外也可以使用startWith等方法进行比较判断
	}
}
