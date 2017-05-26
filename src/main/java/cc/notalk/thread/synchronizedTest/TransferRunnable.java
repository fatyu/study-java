package cc.notalk.thread.synchronizedTest;

class TransferRunnable implements Runnable {
	private Bank bank;
	private int DELAY = 10; //延迟10秒
	private int fromAccount;
	private double maxAmount;

	public TransferRunnable(Bank b, int from, double max) {
		bank = b;
		fromAccount = from;
		maxAmount = max;
	}

	public void run() {
		try {
			while (true) {
				int toAccount = (int) (bank.size() * Math.random());
				double amount = maxAmount * Math.random();
				bank.transfer(fromAccount, toAccount, amount);
				Thread.sleep((int) (DELAY * Math.random()));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
