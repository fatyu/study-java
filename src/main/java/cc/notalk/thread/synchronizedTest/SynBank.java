package cc.notalk.thread.synchronizedTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynBank extends Bank {
	private final double[] accounts;

	public SynBank(int n, double initialBalance) {
		accounts = new double[n]; // 数组100
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = initialBalance; // 为每个账户'充值'1000
	}

	/**
	 * 获得银行的全部金额
	 *
	 * @@return
	 */
	public double getTotalBalance() {
		double sum = 0;
		for (double a : accounts)
			sum += a;
		return sum;
	}

	/**
	 * 返回账户个数
	 *
	 * @@return
	 */
	public int size() {
		return accounts.length;
	}

	/**
	 * 现金的转移 再1.5以后可以使用两种方式进行线程访问资源的锁
	 * <br>1.使用<b><code>synchronized</code></b>的关键字修饰方法
	 * <br>2.使用Lock接口
	 * @@see java.util.concurrent.locks.ReentrantLock
	 * @@param from
	 * @@param to
	 * @@param amount
	 *            金额
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
	public void transfer(int from, int to, double amount) {
		bankLock.lock();
	}
}
