package cc.notalk.bp.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 使用Socket连接读取网页内容
 * 
 * @author fatyu
 * 
 */
public class TestHttpProtocol {

	public static void main(String[] args) {
		try {
			// 建立连接
			Socket socket = new Socket("127.0.0.1", 8080);

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 传递参数
			pw.println("GET / HTTP/1.1");
			pw.println("Host: localhost");
			pw.println("Content-Type:text/html");

			// 输出空行 表示提交命令
			pw.print("\n");
			pw.flush();

			BufferedReader bd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String s = "";
			while ((s = bd.readLine()) != null) {
				System.out.println(s);
			}
			bd.close();
			pw.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
