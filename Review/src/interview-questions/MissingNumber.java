package com.interviewquestions;
import java.util.Random;

public class MissingNumber {
	
	public static void main(String[] args) {

		// range for array (1 to 100), can be changed to another range
		int range = 100;
		
		// random number from 1 to 100
		Random rand = new Random();
		int exclude = rand.nextInt(range) + 1;
		//int exclude = 50;  // test case where number right in middle

		// print number picked
		System.out.println("Number to Remove: " + exclude);

		
		
		// create array, make sure one less than the range since we are
		// taking away a number
		int[] arr = new int[range - 1];

		// counter for adding number to array
		int count = 1;
		
		// add numbers to array from 1 to 100 excluding one random number
		for (int i = 0; i < arr.length; i++) {

			if(count != exclude) { // if number is not the excluded, add it to array...
				arr[i] = count;
			}
			else { // ...if it is, decrement i so we don't skip index when adding it to array
				i--;
			}
			
			count++;
		}
		
		
		
		
		System.out.println( "Missing: " + missingFromArr(arr));

	}



	public static int missingFromArr(int[] arr) {

		// sum we should get when adding two matching edge points
		int expectedSum = 1 + arr.length + 1;
		System.out.println("expected total: " + expectedSum);

		
		// track end and start of array (edge points) 
		int start = 0, end = arr.length - 1;
		
		
		for(int i = 0; i < arr.length / 2; i++) {
			
			// print to see calculations, can be commented out
			System.out.println(arr[start] + " + " + arr[end] + " = " + (arr[start] + arr[end]));
			
			if(arr[start] + arr[end] != expectedSum) { // if sum not expected one...
				// 2 and 100 = 102
				
				if(arr[start] + arr[end] > expectedSum) // if less than expected...
					return arr[start] - 1; 
				else
					return arr[end] + 1; 
				
			}
			
			start++;
			end--;
			
		}
		
		// if not found above, must be the middle-most number
		return (arr.length + 1) / 2;
	}

}
