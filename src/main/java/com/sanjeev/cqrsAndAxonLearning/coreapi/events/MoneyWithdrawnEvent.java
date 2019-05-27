package com.sanjeev.cqrsAndAxonLearning.coreapi.events;

public class MoneyWithdrawnEvent {
	private String accountId;
	private int amount;
	private int balance;

	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
