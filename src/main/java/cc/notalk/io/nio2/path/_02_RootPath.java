package cc.notalk.io.nio2.path;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 获取文件所在路径的根路径
 * 		windows:c:\或者d:\等盘符
 * 		*nix:/
 * @author fatyu
 */
public class _02_RootPath {
	public static void main(String[] args) {
		FileSystem defaultFileSystem = FileSystems.getDefault();
		//获取文件的路径对应的根路径
		Path path = defaultFileSystem.getPath("D:\\Maven\\conf\\logging\\simplelogger.properties");
		System.out.println("获取文件的路径对应的根路径:" + path.getRoot().toString());
	}
}
