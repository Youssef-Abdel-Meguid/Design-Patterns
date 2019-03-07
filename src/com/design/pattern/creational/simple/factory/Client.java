package com.design.pattern.creational.simple.factory;

public class Client {

	public static void main(String[] args) {
		
		Post post = PostFactory.createPost("news");
		
		System.out.println(post + "\n");
		
		post = PostFactory.createPost("product");
		
		System.out.println(post + "\n");
		
		post = PostFactory.createPost("blog");
		
		System.out.println(post);
		
	}

}
