package ch05;

public class A {
	//default 접근 제한다 메소드
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
	public void method1() {  //오버로딩 된 메소드는 부모클래스의 접근제한보다 같거나 넓은 제한을 사용해야 함. 
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