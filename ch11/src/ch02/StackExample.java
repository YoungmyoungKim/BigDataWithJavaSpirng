package ch02;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push(new Boolean(true));
		stack.push(new Integer(10));
		
		//AutoBoxing
		stack.push(10.0);
		stack.push(false);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
