package ch05;

public class A {
	//default ���� ���Ѵ� �޼ҵ�
	void method1() {
		System.out.println("class A's method1");
	}
	void method1(int x) {
		System.out.println("class A's overloading method1, "+x);
	}
	void method2(int x) {
		System.out.println("class A's method2, "+x);
	}
	
	void method3(int x, int y) {
		System.out.println("class A's method3, "+"("+x+", "+y+")");
	}
	
	
}

class B extends A{
	@Override
	public void method1() {  //�����ε� �� �޼ҵ�� �θ�Ŭ������ �������Ѻ��� ���ų� ���� ������ ����ؾ� ��. 
		System.out.println("class B's override method1");
	}
	@Override
	public void method2(int x) {
		System.out.println("class B's override method2, "+x);
	}
}

class C extends B{
	public void method1() {  
		System.out.println("class C's override method1");
	}
	
	void method1(int x) {}
	
}