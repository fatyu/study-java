package org.fatyu.thread;

/**
 * <pre>
 * �̵߳�״̬:
 * 1.New[����]��
 * 2.Runnable[������]��
 * 3.Blocked[������]��{����sleep����,��Ҫ�õ��߳������Ǳ������̳߳���,I/O��������}
 * 4.Dead[����]. {run����ִ�������Ȼ����,�����쳣�����߳����}
 * </pre>
 * @author Fatyu
 *
 */
public class ThreadState {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(); //����״̬
		thread.start(); //������״̬,���߳��п�������������,Ҳ����δ����
		thread.sleep(0); //��������״̬
	}
}
