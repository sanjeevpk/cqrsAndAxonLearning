package com.sanjeev.cqrsAndAxonLearning.coreapi.events;

public class ConferenceCreatedEvent {
	private String conferenceId;
	private String conferenceName;
	
	public ConferenceCreatedEvent(String conferenceId, String conferenceName) {
		super();
		this.conferenceId = conferenceId;
		this.conferenceName = conferenceName;
	}
	public String getConferenceId() {
		return conferenceId;
	}
	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}
	public String getConferenceName() {
		return conferenceName;
	}
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
	
}
