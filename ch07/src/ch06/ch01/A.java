package ch06.ch01;

public class A {
	void method() {
		System.out.println("Class A method");
	}
}

class B extends A{
	void method() {
		System.out.println("Class B method");
	} 
}

class C extends A{
	void method() {
		System.out.println("Class C method");
	} 
}