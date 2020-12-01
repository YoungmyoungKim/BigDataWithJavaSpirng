package ch01.ch02;


public class A {
	int field1;
	
	void method1() {
		System.out.println("A's method");
	}

}

class B extends A{
	int field2;
	
	void method2() {
		System.out.println("B's method");
	}
}

//»ó¼Ó extends super class  
class C extends B{
	int field3;
	void method3() {
		field1=10;
		method1();
		field2=20;
		method2();
		System.out.println("C's method");
	}
	
}