package com.design.pattern.creational.simple.factory;

public class ProdcutPost extends Post {

	private String name;
	private String imageUrl;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return "Product Post:\n" +
				   "Id: " + getId() + 
				   "\nTitle: " + getTitle() + 
				   "\nContent: " + getContent() + 
				   "\nCreated Date: " + getCreatedOn() + 
				   "\nPublish Date: " + getPublishedOn() + 
				   "\nName: " + name + 
				   "\nImage URL: " + imageUrl;
	}
}
