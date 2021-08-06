package com.stacks;
import java.util.Stack;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String hello = "Hello";
		
		System.out.println(reverseStringWithStack(hello));

	}
	
	
	public static String reverseStringWithStack(String input) {
		
		if(input == null) {
			throw new IllegalArgumentException();
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.empty()){
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}

}
