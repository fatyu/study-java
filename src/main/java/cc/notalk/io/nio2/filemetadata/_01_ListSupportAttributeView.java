package cc.notalk.io.nio2.filemetadata;

import java.nio.file.FileSystems;
import java.util.Iterator;
import java.util.Set;

/**
 * 查看文件系统支持的文件属性view
 * @author fatyu
 *
 */
public class _01_ListSupportAttributeView {

	public static void listSupportAttributeView() {
		Set<String> supportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();

		for (Iterator<String> iterator = supportedFileAttributeViews.iterator(); iterator.hasNext();) {
			String viewName = iterator.next();
			System.out.println(viewName);

		}
	}

	public static void main(String[] args) {
		listSupportAttributeView();
	}
}
