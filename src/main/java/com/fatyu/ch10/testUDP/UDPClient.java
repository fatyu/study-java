package com.fatyu.ch10.testUDP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.InetSocketAddress;

public class UDPClient {
	public static void main(String[] args) {
		File file = new File("e:/a.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		int i = 0;
		byte[] filebytes = new byte[(int) file.length()];

		try {
			while (fis.read() != -1) {
				filebytes[i] = (byte) fis.read();
				i++;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			DatagramPacket dp = new DatagramPacket(filebytes, filebytes.length,
					new InetSocketAddress("127.0.0.1", 8888));
			DatagramSocket ds = new DatagramSocket(9999);

			ds.send(dp);
			ds.close();

		} catch (SocketException se) {
			se.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
