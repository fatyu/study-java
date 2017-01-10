package org.fatyu.thread;

/**
 * <pre>
 * ���̱߳��жϺ����ٵ���sleep(),wait(),join()����.������׳�InterruptException
 * �ٲ���InterruptException�쳣���д���ʱ,Ҫ����ǰ�߳��ж�
 * </pre>
 * <br><code>
 * Thread.currentThread().interrupt();</code>
 * @@author Fatyu
 * @@see java.lang.Thread#interrupt()
 */
public class ThreadInterrupt {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		try {
			t.sleep(100);
			System.out.println("====================-");
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		t.interrupt(); //���߳��ж�
		try {
			t.sleep(100); //��Ϊ�̱߳��ж�,�����ж��쳣
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		} finally {
			System.out.println(t.isAlive());
		}
	}
}
