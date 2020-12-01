package ch01;

public class A {
	int field1;
	
	void method1() {
		System.out.println("A's method");
	}

}

class B extends A{
	String field2;
	
	void method2() {
		field1=10;
		method1();
	}
}

//»ó¼Ó extends super class  
class C extends A{}