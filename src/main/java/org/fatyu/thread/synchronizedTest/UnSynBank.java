package org.fatyu.thread.synchronizedTest;

class UnSynBank extends Bank {
	private final double[] accounts;

	public UnSynBank(int n, double initialBalance) {
		accounts = new double[n]; // ����100
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = initialBalance; // Ϊÿ���˻�'��ֵ'1000
	}

	/**
	 * ������е�ȫ�����
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
	 * �����˻�����
	 *
	 * @@return
	 */
	public int size() {
		return accounts.length;
	}

	/**
	 * �ֽ��ת�� ��ʹ��ͬ�����������,���ܳ����߳��ж�,�����ܺͷ����仯
	 *
	 * @@param from
	 * @@param to
	 * @@param amount ���
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
