package cc.notalk.bp.ch09;

import java.util.Date;

/**
 * 调用sleep方法使得线程休眠n个毫秒
 * 
 * @author fatyu
 * 
 */
public class TestSleep {

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();//启动线程
		try {
			Thread.sleep(10000);//主线程休眠10秒 使得st的run方法执行完毕
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main");
		}
		st.interrupt();//中断线程
	}
}

class SleepThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("---------------" + new Date() + "--------------------");

		}
	}

}
