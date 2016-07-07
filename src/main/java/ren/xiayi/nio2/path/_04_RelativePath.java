package ren.xiayi.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 获取相对路径
 * @see java.nio.file.Paths#get(String first, String... more);
 * @author fatyu
 */
public class _04_RelativePath {
	public static void main(String[] args) {
		//相对路径
		Path propertiesPath = Paths.get("d:", "\\Maven\\conf\\logging\\simplelogger.properties");
		System.out.println(propertiesPath.toString());
		//相对路径使用normalize()
		Path xmlPath = Paths.get("d:", "\\Maven\\conf\\logging\\simplelogger.properties", "..\\..\\settings.xml")
				.normalize();
		System.out.println(xmlPath);

		//获取两个path之间的路径关系
		Path firstFilePath = Paths.get("D:\\Maven\\conf\\settings.xml");
		Path secondFilePath = Paths.get("D:\\Maven\\conf\\logging\\simplelogger.properties");
		Path frs = firstFilePath.relativize(secondFilePath);
		System.out.println("[D:\\Maven\\conf\\settings.xml]相对于[D:\\Maven\\conf\\logging\\simplelogger.properties]:"
				+ frs.toString());
		Path srf = secondFilePath.relativize(firstFilePath);
		System.out.println("[D:\\Maven\\conf\\logging\\simplelogger.properties]相对于[D:\\Maven\\conf\\settings.xml]:"
				+ srf.toString());
	}
}
