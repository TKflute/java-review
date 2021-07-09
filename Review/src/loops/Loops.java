package com.loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        
        Scanner keyboard = new Scanner(System.in);
                  
        System.out.println("I will keep asking you for a cookie until you say 'yes'...");
        
        // STEP 1
        boolean keepLooping = true;
        
        while(keepLooping) {
        	System.out.println("Can I have a cookie?");
        	String input = keyboard.next();
        	if(input.toLowerCase().equals("yes")) {
        		keepLooping = false;
        	}
        }
                
        
        // STEP 2
        keepLooping = false;
        
        do {
        	System.out.println("Can I have some cake too?");
        }while(keepLooping);
        
        
        // STEP 3
        int counter;
        int endIndex = 10;
        
        for(counter = 0; counter <= endIndex; counter++) {
        	System.out.println("COUNTER: " + counter);
        }
        
        
        // STEP 4
        endIndex = 0;
        
        for(counter = 10; counter >= endIndex; counter--) {
        	System.out.println("COUNTER: " + counter);
        }
        	
        
        // STEP 5
        // counter variable 
        int i = 0;
        int len = 6;
        
        while(i < len) {
        	System.out.println(i);
        	i++;
        }
        
                   
        // STEP 6
        System.out.println("Enter a number between 1 and 10");
        int input = keyboard.nextInt();
        int total = 0;
        
        for(int x = 0; x <= 10; x++) {
        	total += x; 
        	if(x == input) {
        		break;
        	}
        }
        
        System.out.println("The total is:" + total);
        
        // STEP 7
        System.out.println("Enter another number between 1 and 10");
        input = keyboard.nextInt();
        for(int x = 1; x <= 10; x++) {
        	if(x == input) {
        		continue;
        	}
        	System.out.println(x);
        }
        
                        
        
        // var scope
        String myStr = null;
        for(counter = 0; counter < endIndex; counter++){
            myStr = "hello";
        }
        
        System.out.println(myStr);
        
        keyboard.close();

    }
}