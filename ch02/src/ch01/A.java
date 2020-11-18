package ch01;

public class A {
	//변수 a, b는 식별자
	int a;
	int b;
	//상수 PI는 식별자 
	final double PI=3.141592; //오른편의 상수 PI를 초기화하는 실제값: 리터럴 
	
	//메소드명 'method1', 'method2'는 식별자
	static void method1() {System.out.println("Hi");}
	static void method2() {System.out.println("Hello");}
	
	public static void main(String[] args) {
		method2();  
	}
	
}
