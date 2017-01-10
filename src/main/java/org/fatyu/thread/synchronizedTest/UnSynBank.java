package org.fatyu.thread.synchronizedTest;

class UnSynBank extends Bank {
	private final double[] accounts;

	public UnSynBank(int n, double initialBalance) {
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
	 * 现金的转移 不使用同步锁的情况下,可能出现线程中断,导致总和发生变化
	 *
	 * @@param from
	 * @@param to
	 * @@param amount 金额
	 */
	public void transfer(int from, int to, double amount) {
		if (accounts[from] < amount) {
			return;
		}
		System.out.print(Thread.currentThread());
		accounts[from] -= amount;
		System.out.printf(" %10.2f from %d to %d", amount, from, to);
		accounts[to] += amount;
		System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
	}
}
