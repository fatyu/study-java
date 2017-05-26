package cc.notalk.io.nio2.filemetadata;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileStoreAttributeView;

/**
 * FileStore 这个抽象类来得到每种类型的文件存储信息
 * @author fatyu
 *
 */
public class _07_FileStoreViewFileAttributes {

	public static void fileStoreViewFileAttributes() throws IOException {
		Path path = Paths.get("D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3");
		FileStore fileStore = Files.getFileStore(path);
		System.out.println("--------------------------------------------");
		System.out.println("TotalSpace:" + fileStore.getTotalSpace() / 1024 / 1024 / 1024 + "G");
		System.out.println("UsableSpace:" + fileStore.getUsableSpace() / 1024 / 1024 / 1024 + "G");
		System.out.println("UnallocatedSpace:" + fileStore.getUnallocatedSpace() / 1024 / 1024 / 1024 + "G");
		System.out.println(
				"UsedSpace:" + (fileStore.getTotalSpace() - fileStore.getUsableSpace()) / 1024 / 1024 / 1024 + "G");

		FileStoreAttributeView fsav = fileStore.getFileStoreAttributeView(FileStoreAttributeView.class);
		System.out.println("mp3 fileStoreAview is :" + (null == fsav ? "null" : fsav.name()));

	}

	public static void main(String[] args) {

		try {
			fileStoreViewFileAttributes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
