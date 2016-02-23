package org.fatyu.thread.synchronizedTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynBank extends Bank{
    private final double[] accounts;

    public SynBank(int n,double initialBalance){
	accounts = new double[n]; // ����100
	for (int i = 0; i < accounts.length; i++)
	    accounts[i] = initialBalance; // Ϊÿ���˻�'��ֵ'1000
    }

    /**
     * ������е�ȫ�����
     *
     * @@return
     */
    public double getTotalBalance(){
	double sum = 0;
	for (double a : accounts)
	    sum += a;
	return sum;
    }

    /**
     * �����˻�����
     *
     * @@return
     */
    public int size(){
	return accounts.length;
    }

    /**
     * �ֽ��ת�� ��1.5�Ժ����ʹ�����ַ�ʽ�����̷߳�����Դ����
     * <br>1.ʹ��<b><code>synchronized</code></b>�Ĺؼ������η���
     * <br>2.ʹ��Lock�ӿ�
     * @@see java.util.concurrent.locks.ReentrantLock
     * @@param from
     * @@param to
     * @@param amount
     *            ���
     */
    //	1.synchronized
    //	public synchronized void transfer(int from, int to, double amount) {
    //		if (accounts[from] < amount) {
    //			return;
    //		}
    //		System.out.print(Thread.currentThread());
    //		accounts[from] -= amount;
    //		System.out.printf(" %10.2f from %d to %d", amount, from, to);
    //		accounts[to] += amount;
    //		System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    //	}
    //2.Lock
    Lock bankLock = new ReentrantLock();

    @Override
    public void transfer(int from,int to,double amount){
	bankLock.lock();
    }
}
