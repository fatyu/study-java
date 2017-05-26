package cc.notalk.io.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件路径转化为file:///
 * @author fatyu
 */
public class _05_Path2Uri {
	public static void main(String[] args) {
		Path filePath = Paths.get("D:\\Maven\\conf\\logging\\simplelogger.properties");
		//文件路径转
		System.out.println("获取文件的路径对应的根路径:" + filePath.toUri());
	}
}
