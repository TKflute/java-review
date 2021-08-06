package com.stacks;
import java.util.ArrayList;

public class Stack {
	 
	// Members:
	// array[n] or ArrayList, etc.
	// capacity (n) if using array
	// top (tracks current top of Stack and makes array function as Stack)
	
	// Methods:
	// push
	// pop
	// peek
	// empty
	// size 
	
	private ArrayList<Object> stack;
	private int top;
	
	
	public Stack() {
		stack = new ArrayList<>();
		top = -1;
	}
	
	public void push(Object obj) {
		top++;
		stack.add(top, obj);
	}
	
	public Object pop() {
		
		if(!empty()) {
			Object last = stack.get(top);
			stack.remove(top);
			top--;
			return last;
		}
		return null;	
	}
	
	public Object peek() throws RuntimeException {

		if (!empty()) {
			Object last = stack.get(top);
			return last;
		}
		// ask interviewer about handling operations on empty stack
		// this is better than returning null
		throw new RuntimeException("Stack is empty");
	}
	
	public boolean empty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return stack.size();
	}

}