package com.sanjeev.cqrsAndAxonLearning.controller;

import java.util.UUID;

import org.axonframework.commandhandling.callbacks.LoggingCallback;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjeev.cqrsAndAxonLearning.coreapi.commands.AddTalkCommand;
import com.sanjeev.cqrsAndAxonLearning.coreapi.commands.CreateConferenceCommand;

@RestController
public class ConferenceController {
	
	private CommandGateway commandGateWay;
	public ConferenceController(CommandGateway commandGateway) {
		this.commandGateWay = commandGateway;
	}
	
	
	@GetMapping
	public void createConference() {
		commandGateWay.send(new CreateConferenceCommand(UUID.randomUUID().toString(), "JavaDay2017"), LoggingCallback.INSTANCE);
		commandGateWay.send(new CreateConferenceCommand(UUID.randomUUID().toString(), "JavaDay2018"), LoggingCallback.INSTANCE);
		commandGateWay.send(new CreateConferenceCommand(UUID.randomUUID().toString(), "JavaDay2019"), LoggingCallback.INSTANCE);
		commandGateWay.send(new AddTalkCommand(UUID.randomUUID().toString(), "JavaDay2017", "Sanjeev"));
		commandGateWay.send(new AddTalkCommand(UUID.randomUUID().toString(), "JavaDay2017", "ffds"));
	}
}
