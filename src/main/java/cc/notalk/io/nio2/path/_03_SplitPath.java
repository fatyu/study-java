package cc.notalk.io.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 根路径:
 *     Windows 系统支持多个根节点，每个根节点表示一个磁盘分区，例如 C:\ 或 D:\。
 *     *nix 系统只支持一个根节点，根节点由正斜线表示/
 * 分隔符:
 *     在 *nix 中使用正斜线（/），在 Windows 系统中使用反斜线（\）
 * @author fatyu
 */
public class _03_SplitPath {
	public static void main(String[] args) {
		Path filePath = Paths.get("D:\\Maven\\conf\\logging\\simplelogger.properties");
		System.out.println(filePath.toString());
		//遍历路径中所有的文件夹及文件名称
		for (int i = 0; i < filePath.getNameCount(); i++) {
			System.out.println("获取文件的路径对应的根路径:" + filePath.getName(i));
		}
	}
}
