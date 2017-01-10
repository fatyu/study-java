package org.fatyu.thread.synchronizedTest;

public class SynchBankTest {
	public static final int NACCOUNTS = 100; // 100���˻�
	public static final double INITIAL_BALANCE = 1000; // ÿ���˻�1000Ԫ

	public static void main(String[] args) {
		Bank b = new SynBank(NACCOUNTS, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++) {
			TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}
