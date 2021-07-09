package com.classesandobjects;

public class Tiger extends Animal {
	
	public Tiger(int weight) {
		setWeight(weight);
		setType("tiger");
	}
	
	public void move() {
		System.out.println("This tiger runs");
	}

	@Override
	public String toString() {
		return "Tiger [weight()=" + getWeight() + ", type()=" + getType() + "]";
	}
}
