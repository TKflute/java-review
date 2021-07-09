package com.classesandobjects;

public class Animal {

	private double weight;
	private String type;
	private static int animalCount = 0;

	public Animal() {
		this(0, "unknown");
	}
	
	public Animal(double weight, String type) {
		super();
		this.weight = weight;
		this.type = type;
		animalCount++;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static void getCount() {
		System.out.println("Count: " + animalCount);
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", type=" + type + "]";
	}

	public void move() {
		System.out.println("This animal moves");
	}
}
