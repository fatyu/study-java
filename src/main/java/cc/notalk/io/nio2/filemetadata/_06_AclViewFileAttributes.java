package cc.notalk.io.nio2.filemetadata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

/**
 * AclView 一个访问控制列表（ACL）就是一组用来精确控制访问文件的权限列表
 * @author fatyu
 *
 */
public class _06_AclViewFileAttributes {

	public static void aclViewFileAttributes() throws IOException {
		Path path = Paths.get("D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3");

		AclFileAttributeView aclview = Files.getFileAttributeView(path, AclFileAttributeView.class);
		try {
			List<AclEntry> acl = aclview.getAcl();
			for (AclEntry aclentry : acl) {
				System.out.println("-----------------------------------------------------");
				System.out.println("Principal: " + aclentry.principal().getName());
				System.out.println("Type: " + aclentry.type().toString());
				System.out.println("Permissions: " + aclentry.permissions().toString());
				System.out.println("Flags: " + aclentry.flags().toString());
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		try {
			aclViewFileAttributes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
