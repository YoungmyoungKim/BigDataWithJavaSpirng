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
		super.method1();   //�ڽ�Ŭ�������� �θ� �żҵ� ȣ��: super.�θ�޼ҵ�();
	}
	void method4() {
		this.method1();   //���� Ŭ���� ������ �ٸ� �޼ҵ带 ȣ�� this.�޼ҵ��();
	}
}