package com.sanjeev.cqrsAndAxonLearning.coreapi.commands;

public class CreateAccountCommand {
	private String accountId;
	private int overdraftLimit;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}
