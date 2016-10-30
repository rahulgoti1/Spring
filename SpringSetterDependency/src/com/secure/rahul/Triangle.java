package com.secure.rahul;

public class Triangle {
	private String type;
	private int height;

	public void setType(String type) {
		this.type = type;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(this.type + " triangle is drawn of height " + this.height);
	}
}
