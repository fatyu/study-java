package com.fatyu.ch10.testUDP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		byte[] bytes = new byte[18];// 用来存储数据

		//
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(8888);
		} catch (SocketException se) {
			se.printStackTrace();
		}

		for (;;) {
			try {
				ds.receive(dp);
				FileOutputStream fos = new FileOutputStream("e:/cp.txt");
				
				
				for(int i =0;i<bytes.length;i++){
					fos.write((char)bytes[i]);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
