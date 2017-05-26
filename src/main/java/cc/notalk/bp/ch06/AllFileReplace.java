package cc.notalk.bp.ch06;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 递归替换文件
 * 
 * @author fatyu
 * 
 */
public class AllFileReplace {

	public AllFileReplace() {
		super();
	}

	public static boolean replaceFile(String newFile, File rootNode) {

		List<File> list = findFiles(rootNode);
		System.out.println(list.size());
		for (File singleFile : list) {
			System.out.println(singleFile.getPath());
			singleFile.delete();
		}
		return true;
	}

	/**
	 * 传递文件根路径
	 * 
	 * @@param rootDir
	 */
	public static List<File> findFiles(File rootDir) {

		List<File> fileList = new ArrayList<File>();
		File[] files = rootDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				findFiles(files[i]);
			} else {
				System.out.println(files[i].getName());
				if (files[i].getName().equals("Root")) {
					fileList.add(files[i]);
				}

			}

		}

		return fileList;
	}

	public static void main(String args[]) {

		boolean flag = replaceFile(null, new File("D:\\itl-project\\tlm-kqfw"));
		System.out.println(flag);

	}
}
