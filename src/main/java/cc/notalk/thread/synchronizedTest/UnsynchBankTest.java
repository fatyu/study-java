package cc.notalk.thread.synchronizedTest;

public class UnsynchBankTest {
	public static final int NACCOUNTS = 100; // 100个账户
	public static final double INITIAL_BALANCE = 1000; // 每个账户1000元

	public static void main(String[] args) {
		UnSynBank b = new UnSynBank(NACCOUNTS, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++) {
			TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}
