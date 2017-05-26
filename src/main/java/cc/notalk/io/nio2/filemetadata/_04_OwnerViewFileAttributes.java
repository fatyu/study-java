package cc.notalk.io.nio2.filemetadata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/**
 * DosView 只提供四个属性
 * @author fatyu
 *
 */
public class _04_OwnerViewFileAttributes {

	public static void ownerViewFileAttributes() throws IOException {

		String dirPath = "D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3";
		Path path = Paths.get(dirPath);
		//获取文件的所有者视图
		FileOwnerAttributeView fileOwnerAttributeView = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		try {
			fileOwnerAttributeView.getOwner().getName();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			UserPrincipal owner = (UserPrincipal) Files.getAttribute(path, "owner:owner");
			System.out.println(
					"[D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3 owner] is :"
							+ owner.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

		//设置文件的所有者视图
		UserPrincipal userPrincipal = path.getFileSystem().getUserPrincipalLookupService()
				.lookupPrincipalByName("Guest");
		Files.setAttribute(path, "owner:owner", userPrincipal);
		try {
			UserPrincipal owner = (UserPrincipal) Files.getAttribute(path, "owner:owner");
			System.out.println(
					"[D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3 owner] is :"
							+ owner.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			ownerViewFileAttributes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
