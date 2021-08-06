package com.stacks;

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
}
