package ch06;

public class A {
	void method1() {
		System.out.println("Class A method1");
	}
}

class B extends A{
	void method1() {
		System.out.println("Class B method1");
	} 
	void method2() {
		System.out.println("Class B method2");
	} 
	
	void method3() {
		super.method1();   //자식클래스에서 부모 매소드 호출: super.부모메소드();
	}
	void method4() {
		this.method1();   //같은 클래스 내에서 다른 메소드를 호출 this.메소드명();
	}
}