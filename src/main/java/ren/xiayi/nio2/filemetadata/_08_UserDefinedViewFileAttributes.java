package ren.xiayi.nio2.filemetadata;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * @author fatyu
 *
 */
public class _08_UserDefinedViewFileAttributes {

	public static void userDefinedViewFileAttributes() throws IOException {
		Path path = Paths.get("D:\\CloudMusic\\W&W,Kygo,Parson James - Stole The Show (DARY & W&W Remix).mp3");

		UserDefinedFileAttributeView udfav = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
		//查看用户定义的文件属性
		printFileUserDefinedViewAttrs(udfav);//获取文件的自定义属性
		String attr = "file.createUser.description";
		int writtenCharLength = udfav.write(attr, Charset.defaultCharset().encode("张中"));//修改文件的自定义属性
		System.out.println("the file attr desc length is :" + writtenCharLength);
		printFileUserDefinedViewAttrs(udfav);

		//读取某个自定义属性
		int capacity = udfav.size(attr);
		ByteBuffer attrValue = ByteBuffer.allocateDirect(capacity);
		udfav.read(attr, attrValue);
		attrValue.flip();
		System.out.println("file attr desc :" + Charset.defaultCharset().decode(attrValue));
		//删除某个自定义属性
		udfav.delete(attr);

	}

	private static void printFileUserDefinedViewAttrs(UserDefinedFileAttributeView udfav) throws IOException {
		for (String name : udfav.list()) {
			System.out.println(udfav.size(name) + "--->" + name);
		}
	}

	public static void main(String[] args) {
		try {
			userDefinedViewFileAttributes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
