package com.interviewquestions;
public class CountingValleys {

	public static void main(String[] args) {
		int steps = 8;
		String stepPattern = "UDDDUDUU";
		int valleys = countingValleys(steps, stepPattern);
		System.out.println(valleys);

	}
	
	// Complete the countingValleys function below.
    static int countingValleys(int steps, String stepPattern) {
    	
    	//look for U's and D's
    	//loop through string- n < steps
    	//**key: only time need to count a new valley is when we break sea level again
    	int valleys = 0;
    	int currentLevel = 0;
    
    	for(int i = 0; i < steps; i++) {
    		
    		if(stepPattern.charAt(i) == 'D') {
    			if(currentLevel == 0) {
    				valleys++;
    			}
    			currentLevel -= 1;
    		}else if(stepPattern.charAt(i) == 'U') {
    			currentLevel += 1;
    		}
    	}
    	
    	return valleys;

    }

}