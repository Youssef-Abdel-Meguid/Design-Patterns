package com.design.pattern.creational.simple.factory;

public class PostFactory {
	
	public static Post createPost(String type) {
		
		switch (type) {
			case "blog":
				return new BlogPost();
			case "product":
				return new ProdcutPost();
			case "news":
				return new NewsPost();
			default:
				throw new IllegalArgumentException("Unknown post type");
		}
		
	}

}
