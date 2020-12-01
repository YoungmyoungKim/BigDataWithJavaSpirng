package ch01.ch05;

public class A {
	private int x;   //외부에서 접근 불가
	public int getX() {
		return x;
	}
}

class B extends A{
	void method() {
		System.out.println(getX());
	}
}