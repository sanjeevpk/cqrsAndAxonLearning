package com.sanjeev.cqrsAndAxonLearning.coreapi.events;

public class AccountCreatedEvent {
	private String accountId;
	private int overdraftLimit;
	
	public AccountCreatedEvent() {
	}
	
	public AccountCreatedEvent(String accountId, int overdraftLimit) {
		this.accountId = accountId;
		this.overdraftLimit = overdraftLimit;
	}

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
