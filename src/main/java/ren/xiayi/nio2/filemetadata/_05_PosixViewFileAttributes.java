package ren.xiayi.nio2.filemetadata;

import java.io.IOException;

/**
 * PosixView
 *     POSIX 视图扩展 Basic 视图并支持 Unix 及其它相关操作系统。POSIX 视图支持文件所有者、组拥有者、以及九个访问权限
 * @author fatyu
 *
 */
public class _05_PosixViewFileAttributes {

	public static void posixViewFileAttributes() throws IOException {

		/**
		 * windows下执行抛出异常
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 *		at sun.nio.fs.WindowsFileSystemProvider.readAttributes(WindowsFileSystemProvider.java:192)
		 *		at java.nio.file.Files.readAttributes(Files.java:1737)
		 *		at ren.xiayi.nio2.filemetadata._05_PosixViewFileAttributes.posixViewFileAttributes(_05_PosixViewFileAttributes.java:21)
		 *		at ren.xiayi.nio2.filemetadata._05_PosixViewFileAttributes.main(_05_PosixViewFileAttributes.java:31)
		 */
		//		String dirPath = "D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3";
		//		Path path = Paths.get(dirPath);
		//		PosixFileAttributes atts = Files.readAttributes(path, PosixFileAttributes.class);//获取文件属性
	}

	public static void main(String[] args) {
		try {
			posixViewFileAttributes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
