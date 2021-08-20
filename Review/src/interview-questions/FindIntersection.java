package com.interviewquestions;

import java.util.Scanner;

public class FindIntersection {

	public static void main(String[] args) {
		String strArr[] = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
	    System.out.print(FindIntersection(strArr)); 
	}
	
	public static String FindIntersection(String[] strArr) {
	    //split string array into two string arrays (strArr[0] and [1])
	    String first = strArr[0];
	    String second = strArr[1];
	    String intersect = "";
	    
	    String[] arr1 = first.split(",");
	    String[] arr2 = second.split(",");

	    for(int i = 0; i < arr1.length; i++){
	      for(int j = 0; j < arr2.length; j++){
	        if(arr1[i].equals(arr2[j])){
	          intersect += arr1[i];
	        }
	      }
	    } 
	    return intersect;
	  }


}
