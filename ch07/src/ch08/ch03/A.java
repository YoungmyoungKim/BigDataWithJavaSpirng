package ch08.ch03;

public class A {
	void method1() {
		System.out.println("class A");
	}
}

class B extends A{
	void method1() {
		System.out.println("override in class B");
	}
	void method2() {
		System.out.println("class B");
	}
}