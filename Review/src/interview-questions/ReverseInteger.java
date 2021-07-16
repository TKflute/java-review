package com.teekaywebdev.interviewprep;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 123456;
		int reverseNum = reverseInteger(num);
		System.out.println(reverseNum);
	}
	
	public static int reverseInteger(int num) {
		
		// first idea: convert num to array of chars, use a reverse method or loop backwards to make a reverse char array
		// convert back to an int
		
		// second idea: can keep taking num % 10 to get last digit, convert to a char, and add to a char array/String
		
		// third idea: is there a method to use w/ Integer class? - checked reverse method, and doesn't work like String reverse
		// can use Integer to convert to String and reverse with StringBuilder, than back to int
		
		// would be best to add for precondition or throw an exception for wrong input
		// approach 3 (easiest):
//		String numString = Integer.toString(num);
//		String reverseString = new StringBuilder(numString).reverse().toString();
//		
//		int reverseNum = Integer.parseInt(reverseString);
//		
//		return reverseNum;
		
		// approach 2:
//		int length = new StringBuilder(Integer.toString(num)).length();
//		StringBuilder sbNum = new StringBuilder();
//		
//		for(int i = 0; i < length; i++) {
//			int lastDigit = num % 10;
//			num = num / 10;
//			sbNum.append(lastDigit);
//		}
//		
//		return Integer.parseInt(sbNum.toString());
		
		// improved approach 2 (using mod 10, but no Strings):
		
		long reversed = 0;
		while(num != 0) {
			
			// if mult by 10 first, don't need to account for having wrong number of digits
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}
		
		// need to account for both max and min value range
		if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
			// ask interviewer - return 0, throw Exception, etc?
			throw new RuntimeException("reverse of input int exceeds in max value");	
		}else {
			return (int)reversed;
		}
		
	}
	
}
