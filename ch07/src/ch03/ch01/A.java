package ch03.ch01;

public class A {
	public A() {System.out.println("A의 기본 생성자 ");}
	public A(int x) {System.out.println("매개 변수 x 가 있는 A의 생성자 ");}
	
}

class B extends A{
	public B() {System.out.println("B의 기본 생성자 ");}
}
