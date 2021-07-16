package com.teekaywebdev.interviewprep;

public class ReverseString {

	public static void main(String[] args) {
		
		//Create a method that takes a string, reverses it, and returns reversed string
		// can use built in methods
		String hello = "Hello";
		System.out.println(reverseString(hello));
		
		//Part 1: Create a second method that doesn't use built in methods to reverse string
		String world = "World";
		System.out.println(reverseString2(world));
		//Part 2: Reverse each word individually for string w/ mult words
		String helloWorld = "Hello World";
		System.out.println(reverseString3(helloWorld));

	}
	
	public static String reverseString(String str) {
		
		StringBuilder sBuild = new StringBuilder(str);
		sBuild.reverse();
		return sBuild.toString();
	}
	

	public static String reverseString2(String str) {

		StringBuilder sBuild = new StringBuilder();
		for(int i = str.length() -1; i >= 0; i--) {
			sBuild.append(str.charAt(i));
		}
		
		return sBuild.toString();
	}
	
	public static String reverseString3(String str) {
		
		String[] words = str.split(" ");
		StringBuilder sBuild1 = new StringBuilder();
		
		for(String word : words) {
			StringBuilder sBuild2 = new StringBuilder(word);
			sBuild2.reverse();
			sBuild1.append(sBuild2 + " ");
		}
		
		return sBuild1.toString().trim();
	}
	
	
	public int[] sortArray2(int[] arr) {
		
		//outer loop to loop over whole array
		// inner loop beginning at second index to allow for comparisons
		// inside inner loop, conditional that will compare a left and right index
		// if left index is larger, we will do a swap
		// in order to swap, we will need a temp variable
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int[] sortArray(int[] arr) {
	
		//sorting logic  
		for (int i = 0; i < arr.length; i++){  
			for (int j = i + 1; j < arr.length; j++){  
				int tmp = 0;  
				if (arr[i] > arr[j]) {  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			} 
		}
		return arr;
	}
}
	
	
