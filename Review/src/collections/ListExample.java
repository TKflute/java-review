package com.cognixia.jump.corejava.collectionsandgenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.cognixia.jump.corejava.compositionandinheritance.Bike;

public class ListExample {

	public static void main(String[] args) {
		
		// List<String> fruitList = new ArrayList<>();
		// can switch out these types of lists
		// List<String> fruitList = new LinkedList<>();
		List<String> fruitList = new Vector<>();
		
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("orange");
		fruitList.add("grapes");
		System.out.println(fruitList);
		
		for(String fruit : fruitList) {
			System.out.println(fruit);
		}
		
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}

		fruitList.remove(2);
		System.out.println(fruitList);
		fruitList.remove("apple");
		System.out.println(fruitList);
		
		List<Bike> bikeList = new ArrayList<Bike>();
		bikeList.add(new Bike("blue"));
		bikeList.add(new Bike("red"));
		
		fruitList.clear();
		System.out.println(fruitList);
		System.out.println(fruitList.isEmpty());
		
	}

}
