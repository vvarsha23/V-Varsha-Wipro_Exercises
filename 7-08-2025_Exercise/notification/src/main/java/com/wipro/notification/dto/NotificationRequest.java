package com.wipro.notification.dto;

import com.wipro.notification.entity.NotificationUser;

public class NotificationRequest {
	private NotificationUser user;
    private String action;
	public NotificationUser getUser() {
		return user;
	}
	public void setUser(NotificationUser user) {
		this.user = user;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

}
