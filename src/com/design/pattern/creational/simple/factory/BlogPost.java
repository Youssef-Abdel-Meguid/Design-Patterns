package com.design.pattern.creational.simple.factory;

import java.util.Arrays;

public class BlogPost extends Post {
	
	private String author;
	private String[] tags;
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String[] getTags() {
		return tags;
	}
	
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		
		return "Blog Post:\n" +
		   "Id: " + getId() + 
		   "\nTitle: " + getTitle() + 
		   "\nContent: " + getContent() + 
		   "\nCreated Date: " + getCreatedOn() + 
		   "\nPublish Date: " + getPublishedOn() + 
		   "\nAuthor: " + author + 
		   "\nTags: " + Arrays.deepToString(tags);
		
	}
	
}
