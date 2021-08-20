package com.interviewquestions;
import java.util.Random;

public class MissingNumber {


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
