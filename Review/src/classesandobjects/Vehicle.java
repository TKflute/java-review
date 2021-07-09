package com.classesandobjects;

public class Vehicle {
	
	//attributes
	private String type;
	private String color;
	private int wheels;
	//keeping track of how many Vehicles we have created
	private static int count = 0;
	
	
	public Vehicle(String type, String color, int wheels) {
		//good practice to include super()
		super();
		setType(type);
		setColor(color);
		setWheels(wheels);
		count++;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	//if accessing a static var, best to use a static method
	public static int getCount() {
		return count;
	}
	public String toString() {
		return "Type: " + type + " Color: " + color + " No. of Wheels: " + wheels;
	}

}