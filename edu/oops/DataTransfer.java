package com.edu.oops;

abstract class DataTransfer {
	public abstract void sendSMS();
	public abstract void sendEmail();
	public abstract void sendPushNotification();
	public void display() {
		System.out.println("Message delievered...");
	}
}
