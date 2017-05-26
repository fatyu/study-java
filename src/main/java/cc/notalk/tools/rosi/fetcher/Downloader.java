package cc.notalk.tools.rosi.fetcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import cc.notalk.tools.rosi.Rosi;
import cc.notalk.tools.rosi.util.HttpConnectionManager;

public class Downloader {

	public static void main(String[] args) {
		int season = 815;
		int max_img_num = 50;

		CloseableHttpClient client = HttpConnectionManager.getHttpClient();
		for (int i = 1; i <= season; i++) {
			for (int j = 1; j < max_img_num; j++) {
				String seasonNum = number(i);
				String imgNum = number(j);
				boolean mode1 = mode(client, seasonNum, imgNum, Rosi.mode_001);
				if (mode1) {
					continue;
				} else {
					boolean mode2 = mode(client, seasonNum, imgNum, Rosi.mode_002);
					if (mode2) {
						continue;
					} else {
						mode(client, seasonNum, imgNum, Rosi.mode_003);
					}
				}
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	private static boolean mode(CloseableHttpClient client, String seasonNum, String imgNum, String mode) {
		String uri = mode.replaceAll("%SEASON%", seasonNum).replaceAll("%IMG_NUM%", imgNum);
		System.out.println(uri);
		HttpGet get = new HttpGet(uri);
		CloseableHttpResponse execute = null;
		try {
			execute = client.execute(get);
			HttpEntity entity = execute.getEntity();
			if (null == entity) {
				return false;
			} else if (execute.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				return false;
			} else {
				InputStream content = entity.getContent();
				File dir = new File("/Users/fatyu/Downloads/rosi/" + seasonNum + "/");
				if (dir == null || !dir.exists()) {
					dir.mkdirs();
				}

				File file = new File(dir.getPath() + "/" + imgNum + ".jpg");
				if (file == null || !file.exists()) {
					file.createNewFile();
				}
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buf = new byte[1024];
				int len = 0;
				while ((len = content.read(buf)) != -1) {
					fos.write(buf, 0, len);
				}
				fos.flush();
				fos.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (execute != null) {
					execute.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String number(int num) {
		// 0:补充0 3:长度为3 num:整数      
		String str = String.format("%03d", num);
		return str;
	}

}
