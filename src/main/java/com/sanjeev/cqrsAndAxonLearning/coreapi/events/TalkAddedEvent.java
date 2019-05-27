package com.sanjeev.cqrsAndAxonLearning.coreapi.events;

public class TalkAddedEvent {
	private String conferenceId;
	private String talkTitle;
	private String speaker;
	
	
	public TalkAddedEvent(String conferenceId, String talkTitle, String speaker) {
		super();
		this.conferenceId = conferenceId;
		this.talkTitle = talkTitle;
		this.speaker = speaker;
	}
	public String getConferenceId() {
		return conferenceId;
	}
	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}
	public String getTalkTitle() {
		return talkTitle;
	}
	public void setTalkTitle(String talkTitle) {
		this.talkTitle = talkTitle;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
}
