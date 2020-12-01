package ch07;

public class B {
	final void method() {
		System.out.println("class B's method()");
	}
}

class C extends B{
	/*
	void method() {//재정의 불가 
		System.out.println("class C's method()");
	}*/
}