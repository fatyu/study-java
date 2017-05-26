package cc.notalk.io.nio2.filemetadata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

/**
 * DosView 只提供四个属性
 * @author fatyu
 *
 */
public class _03_DOSViewFileAttributes {

	public static void dosViewFileAttributes() {

		String dirPath = "D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3";

		Path path = Paths.get(dirPath);
		try {
			DosFileAttributes attr = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("hidden?" + attr.isHidden());
			System.out.println("archive?" + attr.isArchive());
			System.out.println("readonly?" + attr.isReadOnly());
			System.out.println("system?" + attr.isSystem());

			Files.setAttribute(path, "dos:hidden", false);
			DosFileAttributes reloadAttr = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("hidden?" + reloadAttr.isHidden());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		dosViewFileAttributes();

	}
}
