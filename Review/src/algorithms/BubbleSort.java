package com.algorithms;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {6, 3, 2, 7, 4};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void bubbleSort(int[] arr) {
		boolean itemSwapped = true;
	
		while(itemSwapped) {
			itemSwapped = false;		
			for(int j = 0; j < (arr.length -1); j++) {
				if(arr[j] > arr[j + 1]) {
					int copy = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = copy;
					itemSwapped = true;
				}
			}				
		}
	}
	
}
