package ren.xiayi.nio2.filemetadata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

public class _02_BasicViewFileAttributes {

	public static void basicViewFileAttributes() {

		String dirPath = "D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3";

		Path path = Paths.get(dirPath);
		try {
			BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

			Object fileKey = attr.fileKey();
			System.out.println("Stole The Show fileKey:" + fileKey);
			System.out.println("File size: " + attr.size());
			System.out.println("File creation time: " + attr.creationTime());
			System.out.println("File last accessed time: " + attr.lastAccessTime());
			System.out.println("File last modified time: " + attr.lastModifiedTime());
			System.out.println("Is directory? " + attr.isDirectory());
			System.out.println("Is regular file? " + attr.isRegularFile());
			System.out.println("Is symbolic link? " + attr.isSymbolicLink());
			System.out.println("Is other? " + attr.isOther());

			Map<String, Object> readAttributes = Files.readAttributes(path, "size");//返回map集合
			System.out.println(readAttributes);
			//获取文件时间
			FileTime time = FileTime.fromMillis(System.currentTimeMillis());
			System.out.println(time);
			//编辑文件的属性
			//Files.getFileAttributeView(path, BasicFileAttributeView.class).setTimes(time, time, time);
			Files.setAttribute(path, "basic:creationTime", time);
			Map<String, Object> newAttrs = Files.readAttributes(path, "creationTime");//返回map集合
			System.out.println(newAttrs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		basicViewFileAttributes();

	}
}
