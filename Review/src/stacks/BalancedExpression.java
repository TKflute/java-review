package com.stacks;

import java.util.Stack;

public class BalancedExpression {

	// use a stack to determine if brackets in a string match
	// i.e. (([1] + [2]))<a>;  not )[1] + 2(;

		
	private boolean isLeftBracket(char ch) {
		return ch == '(' || ch == '<' || ch == '[' || ch == '{';
	}
	
	private boolean isRightBracket(char ch) {
		return ch == ')' || ch == '>' || ch == ']' || ch == '}';
	}
	
	// he had != instead of ==
	// that would return true when they don't match
	private boolean bracketsMatch(char left, char right) {
		return	(right == ')' && left == '(') ||
				(right == '>' && left == '<') ||
				(right == ']' && left == '[') ||
				(right == '}' && left == '{');
	}
	
	// following along w/ Mosh's process - step 1, check cases only for parens
	// this works for both (1 + 2) and ((((1 + 2)))) b/c will simply skip a push or pop
	public boolean isBalancedStep1(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : input.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}
			if(ch == ')') {
				if(stack.isEmpty()) {
					return false; // to avoid an EmptyStackException
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
