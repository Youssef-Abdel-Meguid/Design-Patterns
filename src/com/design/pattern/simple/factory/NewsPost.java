package com.design.pattern.simple.factory;

import java.time.LocalDateTime;

public class NewsPost extends Post {
	
	private String headline;
	private LocalDateTime newsTime;
	
	public String getHeadline() {
		return headline;
	}
	
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public LocalDateTime getNewsTime() {
		return newsTime;
	}
	
	public void setNewsTime(LocalDateTime newsTime) {
		this.newsTime = newsTime;
	}
	
	@Override
	public String toString() {
		return "News Post:\n" +
			   "Id: " + getId() + 
			   "\nTitle: " + getTitle() + 
			   "\nContent: " + getContent() + 
			   "\nCreated Date: " + getCreatedOn() + 
			   "\nPublish Date: " + getPublishedOn() + 
			   "\nHeadline: " + headline + 
			   "\nNews Time: " + newsTime;
	}
	
}
