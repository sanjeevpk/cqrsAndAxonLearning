package com.sanjeev.cqrsAndAxonLearning.commandModels;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import com.sanjeev.cqrsAndAxonLearning.coreapi.commands.CreateAccountCommand;
import com.sanjeev.cqrsAndAxonLearning.coreapi.events.AccountCreatedEvent;

//@Aggregate
public class AccountAggregate {
	
	//@AggregateIdentifier
	private String accountId;
	
	public AccountAggregate() {
	}
	
	//@CommandHandler
	public AccountAggregate(CreateAccountCommand command) {
		AggregateLifecycle.apply(new AccountCreatedEvent(command.getAccountId(), command.getOverdraftLimit()));
	} 
	//@EventSourcingHandler
	public void on(AccountCreatedEvent event) {
		this.accountId = event.getAccountId();
	}
}
