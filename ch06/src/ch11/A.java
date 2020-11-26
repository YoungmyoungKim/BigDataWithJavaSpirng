package ch11;

public class A {
	public A() {}  //defaut 생성자
	
	//사용자 정의 생성자(매개변수 있는 생성자)
	//생성자 오버로딩 
	//오버로딩 조건 - 매개변수의 타입, 개수, 순서가 달라야 함.
	//A(매개변수타입 변수) <- 시그니처(signature)
	public A(int a) {}
	public A(String a) {}
	public A(double a) {}
	public A(boolean a) {}
	public A(int a, int b) {}
	public A(int a, int b, int c) {}
}
