package com.acs.activitytracker.model;

/**
 * This is just for reference for the upcoming development for trainees.
 * 
 * TODO: Delete this after actual development starts
 * 
 * @author ramprasad.bairi
 *
 */
public class WelcomeNote {
	private String note;
	private String message;

	public WelcomeNote(String note, String message) {
		this.note = note;
		this.message = message;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
