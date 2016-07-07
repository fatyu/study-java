package ren.xiayi.nio2.path;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 根路径:
 *     Windows 系统支持多个根节点，每个根节点表示一个磁盘分区，例如 C:\ 或 D:\。
 *     *nix 系统只支持一个根节点，根节点由正斜线表示/
 * 分隔符:
 *     在 *nix 中使用正斜线（/），在 Windows 系统中使用反斜线（\）
 * @author fatyu
 */
public class _01_OsPath {
	public static void main(String[] args) {
		//获取文件系统的根路径
		FileSystem defaultFileSystem = FileSystems.getDefault();
		Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
		for (Path p : rootDirectories) {
			System.out.println("获取文件系统的根路径:" + p.toString());
		}
	}
}
