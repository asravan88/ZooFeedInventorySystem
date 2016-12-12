package com.zfis.pojo;

public class Animal {
	
	public String name;
	public int feedRequired;
	public int interval;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFeedRequired() {
		return feedRequired;
	}
	public void setFeedRequired(int feedRequired) {
		this.feedRequired = feedRequired;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	

}
