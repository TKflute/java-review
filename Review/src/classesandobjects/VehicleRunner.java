package com.classesandobjects;
public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("car", "blue", 4);
		
		//don't need to call toString() in order for it to be invoked
		System.out.println(v);
	}

}

