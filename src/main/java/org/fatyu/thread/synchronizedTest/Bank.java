package org.fatyu.thread.synchronizedTest;

public abstract class Bank {
	public abstract double getTotalBalance();

	public abstract int size();

	public abstract void transfer(int from, int to, double amount);
}
