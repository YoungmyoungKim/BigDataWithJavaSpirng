package ch01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push("HGD");
		stack.push("IJM");
		stack.push("HGD");
		stack.push("IKJ");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
