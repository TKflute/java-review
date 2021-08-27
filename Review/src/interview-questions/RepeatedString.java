package com.interviewquestions;

public class RepeatedString {

	public static void main(String[] args) {
		
		// This question is from HackerRank
		// I thought it was to count number of A's
		
		// looking for the letter 'a' in a repeated pattern, i.e. 'aba' or even just 'a'
		// look within n characters
		// return how many a's we find in n chars
		// will have to divide n by pattern somehow

		
		String pattern = "aba";
		long n = 10;
		long numOfAs = repeatedString(pattern, n);
		System.out.println("A exists w/in string " + pattern + " of " + n + " length repeating " + numOfAs + " time(s)");
	}

	 static long repeatedString(String s, long n) {

		 // 1) find length of String pattern s
		 // 2) find out how many a's in one instance of pattern
		 // 3) divide n by length of pattern
		 // 4) multiply result of step 3 by step 2
		 
		 // 1)
		 double patternLen = s.length();
		 int countOfA = 0;
		 
		 // 2) this doesn't account for a's left over
		 for(int i = 0; i < patternLen; i++) {
			 // start with a loop - could you use a regex/Pattern checker and would that be more efficient?
			 if(s.charAt(i) == 'a') {
				 countOfA++;
			 }
		 }
		 
		 // 3) (you could do this step sooner)
		 double instancesOfPatternInN = n / patternLen;
		 // to find num of left over a's, would need to find remainder
		 // of leftover chars
		 // 5) (added after first attempt)
		 int leftoverAs = (int) (n % patternLen);
		 
		 
		 //4) 
		 long totalAs = (long) ((instancesOfPatternInN * countOfA) + leftoverAs);
		 
		
		 return totalAs;
	 }
}
