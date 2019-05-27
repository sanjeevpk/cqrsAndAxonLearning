package com.sanjeev.cqrsAndAxonLearning.coreapi.commands;

public class WithdrawMoneyCommand {
	private String accountId;
	private int amount;
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
}
