package com.fatyu.ch10.testTCP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * 文件上传服务端
 * @@author Fatyu
 *
 */
public class TCPServer {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket ss = new ServerSocket(8888);
			while (true) {
				Socket s = ss.accept();
				System.out.println("success listen a client");
				File file = new File("e:/bak.avi");

				FileInputStream fis = (FileInputStream) s.getInputStream();
				FileOutputStream fos = new FileOutputStream(file);
				int c;
				while ((c = fis.read()) != -1) {
					fos.write((char) c);
				}
				fos.flush();
				fis.close();
				fos.close();
				s.close();
			}

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
