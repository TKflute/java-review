package com.interviewquestions;
import java.util.Random;

public class MissingNumber {


	public static int missingFromArr(int[] arr) {

		// sum we should get when adding two matching edge points
		int expectedSum = 1 + arr.length + 1;
		System.out.println("expected total: " + expectedSum);

		
		// track end and start of array (edge points) 
		int start = 0, end = arr.length - 1;
		
		
		// loop to check if sum of edge points equal our expected sum
		for(int i = 0; i < arr.length / 2; i++) {
			
			
		}
		
		
		return -1;
	}

}
