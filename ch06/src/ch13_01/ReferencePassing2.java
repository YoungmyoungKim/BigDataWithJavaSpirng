package ch13_01;

import ch13_01.ReferencePassing.Circle;

public class ReferencePassing2 {

	public static void main(String[] args) {
		Circle pizza= new Circle(10);
		
		increase(pizza);    //call by reference
		
		System.out.println(pizza.radius);
	}
	
	static void increase(Circle p) {
		Circle newPizza=new Circle(p.radius);
		newPizza.radius++;
	}
}
