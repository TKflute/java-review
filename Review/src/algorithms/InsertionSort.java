package com.algorithms;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		//while number is less than number looping backwards
		
		int[] arr = new int[4];
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 6;
		
		int target = 2;
		int j = arr.length - 2;
		
		while(j >= 0 && arr[j] > target) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = target;
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		int[] arr2 = {6, 5, 4, 3};
		
		insertionSort(arr2);
		System.out.println(Arrays.toString(arr2));

	}
	
	private static void insertionSort(int[] arr) {
		
		//outer pass
		for(int i = 1; i < arr.length; i++) {
			//pull out arr[i]
			int target = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > target) {
				//shift right
				arr[j + 1] = arr[j];
				j--;
			}
			//put it home
			arr[j + 1] = target;
		}
	}

}
