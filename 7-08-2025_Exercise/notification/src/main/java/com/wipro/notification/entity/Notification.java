package com.wipro.notification.entity;

public class Notification {
	private String username;
    private String action;
    public Notification() {}
	public Notification(String username, String action) {
		super();
		this.username = username;
		this.action = action;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}


}
