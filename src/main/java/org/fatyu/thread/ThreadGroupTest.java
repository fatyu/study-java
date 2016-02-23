package org.fatyu.thread;

/**
 * �߳���-�߳����ʾһ���̵߳ļ���
 *
 * @author Fatyu
 * @see java.lang.ThreadGroup
 *
 */
public class ThreadGroupTest{

    public static void main(String[] args){
	// ����һ�����߳��顣���߳���ĸ��߳�����Ŀǰ���������̵߳��߳���.
	ThreadGroup tg = new ThreadGroup("zhangyuThread");
	Thread t = new Thread(tg,"t1");
	System.out.println(tg.activeCount());
	t.start();
	// �߳������interruptʹ���߳�������߳�ȫ���ж�
	tg.interrupt();
	System.out.println(tg.activeCount());
	System.out.println(tg.getName());
	System.out.println(tg.getParent());
    }
}
