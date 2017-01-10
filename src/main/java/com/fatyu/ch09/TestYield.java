package com.fatyu.ch09;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @@author Fatyu
 */
public class TestYield {

	public static void main(String[] args) {
		YieldThread st1 = new YieldThread("st1");
		YieldThread st2 = new YieldThread("st2");
		//st1.setPriority(st1.MAX_PRIORITY);//setPriority not use with (yield)
		st1.start();// 启动线程
		st2.start();
	}
}

class YieldThread extends Thread {

	public YieldThread(String s) {
		super(s);// Invoke the Parent's Constructor
	}

	@Override
	public void run() {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("d:/test.log", true);
			pw = new PrintWriter(fw, true);
			pw.println("Strat logging..." + System.currentTimeMillis());
			for (int i = 1; i <= 1000; i++) {
				if (i % 50 == 0)
					;
				yield();//yield not use with setPriority()
				pw.println(
						this.getName() + "\t:" + i + "\t:" + "---------------" + new Date() + "--------------------");

			}
			pw.println("End logging..." + System.currentTimeMillis());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
