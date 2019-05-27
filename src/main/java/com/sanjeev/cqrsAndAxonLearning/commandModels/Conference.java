package com.sanjeev.cqrsAndAxonLearning.commandModels;

import java.util.ArrayList;
import java.util.List;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import com.sanjeev.cqrsAndAxonLearning.coreapi.commands.AddTalkCommand;
import com.sanjeev.cqrsAndAxonLearning.coreapi.commands.CreateConferenceCommand;
import com.sanjeev.cqrsAndAxonLearning.coreapi.events.ConferenceCreatedEvent;
import com.sanjeev.cqrsAndAxonLearning.coreapi.events.TalkAddedEvent;

@Aggregate
public class Conference {
	@AggregateIdentifier
	private String conferenceId;
	private List<String> talks;
	
	public Conference() {
	}
	
	
	@CommandHandler
	public Conference(CreateConferenceCommand command) {
		AggregateLifecycle.apply(new ConferenceCreatedEvent(command.getConferenceId(), command.getConferenceName()));
	}
	
	@EventSourcingHandler
	public void on(ConferenceCreatedEvent event) {
		this.conferenceId = event.getConferenceId();
		talks = new ArrayList<>();
	}
	
	@CommandHandler
	public void handle(AddTalkCommand command) {
		String talkTitle = command.getTalkTitle();
		if(talks.contains(talkTitle)) {
			throw new RuntimeException("Duplicate Title");
		}
		AggregateLifecycle.apply(new TalkAddedEvent(command.getConferenceId(), command.getTalkTitle(), command.getSpeaker()));
	}
	
	@EventSourcingHandler
	public void on(TalkAddedEvent event) {
		talks.add(event.getTalkTitle());
	}
}
