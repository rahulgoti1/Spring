package com.secure.rahul;

public class Circle {

	private Point center;

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Center of Circle ( " + center.getX() + " , " + center.getY() + " )");
	}
}