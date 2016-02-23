package com.fatyu.ch10.testTCP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/**
 * 文件上传客户端
 * @@author Fatyu
 *
 */
public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 8888);
		} catch (Exception e) {
			e.printStackTrace();
		}

		File file = new File("e:/1.avi");
		FileInputStream fis = null;
		OutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = socket.getOutputStream();

			int c;

			while ((c = fis.read()) != -1) {
				fos.write((char) c);
				//System.out.println((char)c);
			}
			fis.close();
			fos.close();
			socket.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
