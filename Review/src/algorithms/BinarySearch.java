package com.algorithms;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {0, 1, 5, 6, 9, 12};
		int target = 6;
		int indexOfTarget = binarySearch(target, arr);
		System.out.println(indexOfTarget);
		
	}
	
	private static int binarySearch(int target, int[] arr) {
		int l = 0;
		int h = arr.length -1;
		
		while(l <= h) {
			int m = (l + h)/2;
			if(arr[m] == target) {
				return m;
			}else if(target > arr[m]) {
				//search to the right
				l = m + 1;
			}else {
				//search to left
				h = m -1;
			}
		}
		return -1;
	}

}
