package com.arrays;
public class Arrays {

	public static void main(String[] args) {
		
		// STEP 1
		//creating arrays
		int[] myInts = new int[5];
		float[] myFloats = new float[5];
		String[] myStrings = new String[5];
		
		
		// STEP 2
		// populating arrays
		myInts[0] = 5;
		myInts[1] = 6;
		int x = 3;
		myInts[2] = x;
		myInts[3] = 8;
		myInts[x+1] = 11; 
		

		// STEP 3
		//create and populate arrays all at once
		int[] myInts2 = {5, 3, 4, 7, 12};
		String[] myStrings2 = {"Bob", "Sally", "Joe"};
		
		System.out.println(myStrings2.length);
		
		
		// STEP 4
		// Loop through the myStrings array
		//(if there already weren't an x variable, would have to use the int keyword when declaring)
		for(x = 0; x < myStrings.length; x++) {
			System.out.println(myStrings[x]);
		}
		
		
		// STEP 6
		// loop through all the elements in a String array
		// then loop through all the chars in each String
		for(x = 0; x < myStrings2.length; x++) {
			String currentWord = myStrings2[x];
			for(int i = 0; i < currentWord.length(); i++) {
				System.out.println(currentWord.charAt(i));
			}
		}
				
		
	}
}