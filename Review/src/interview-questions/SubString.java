package com.interviewquestions;

public class SubString {

	public static void main(String[] args) {
		// 1.) Given a String called str and another string called sub, check how many times sub appears in str.
		// strCount("hello world", "hello") → 1, strCount("helloworldhelloworld", "hello") -> 2, strCount("hello worldhello") -> 2.
		
		// how to do with String methods, and possibly without?
		// start w/ using the existing API
		// loop through string; use contains() method and a counter
		// keep looping through rest of string after that instance of word and keep checking for contains and increment
		String string = "hello world";
		String subString = "hello";
		int count = countSubString(string, subString);
		System.out.println(subString + " appears in " + string + ": " + count + " times" );
		
		String string2 = "hello worldhello";
		String subString2 = "hello";
		int count2 = countSubString(string2, subString2);
		System.out.println(subString2 + " appears in " + string2 + ": " + count2 + " times" );
		
		
		
		// improved way:

	}
	
	public static int countSubString(String str, String subStr) {
		
		int count = 0;
		// use StringBuilder so can delete portions of String that have already been searched
		StringBuilder sBuild = new StringBuilder(str);
		for(int i = 0; i < sBuild.length(); i++) {
			if(sBuild.toString().contains(subStr)) {
				count++;
				// can't do this because of way contains method works (checks whole String every time)
//				i += subStr.length();
				
				// if String contains substring, find the first index of first occurence w/ indexOf
				// then delete that portion of StringBuilder and keep looping
				int start = sBuild.toString().indexOf(subStr);
				sBuild = sBuild.delete(start, (subStr.length() + 1));
			}
		}
		
		if(count != 0) {
			return count;
		}
		return -1;
	}

}
