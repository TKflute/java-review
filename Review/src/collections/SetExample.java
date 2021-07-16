package com.cognixia.jump.corejava.collectionsandgenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Time complexity: HashSet is faster than TreeSet
		
		Set<Integer> intTree = new TreeSet<>();
		Set<Integer> intHash = new HashSet<>();
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			intTree.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time to process with tree: " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			intHash.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to process with hash: " + (end - start));
		
		/****/
		String[] fruitArr = {"apple", "pear", "banana", "melon"};
		Set<String> fruitTree = new TreeSet<>();
		Set<String> fruitHash = new HashSet<>();
		
		for(String fruit : fruitArr) {
			fruitTree.add(fruit);
			fruitHash.add(fruit);
		}
		
		Iterator<String> iterFruit = fruitHash.iterator();
		while(iterFruit.hasNext()) {
			System.out.println(iterFruit.next());
		}

//		Set<Vehicle> vehicleSet = new TreeSet<>();
//		Vehicle v = new Vehicle();
//		vehicleSet.add(v);
//		vehicleSet.add(new Vehicle("Nissan", 80000));
//		// will throw an exception (would work w/ HashSet)
//		System.out.println(vehicleSet.remove(v));
		
	}

}
