package ch01.ch03;

class A1 {
	int a1=34;
	void method1() {System.out.println("A1 method");}
}

class A2 extends A1 {
	int a2=10;
	void method2() {System.out.println("A2 method");}
}

class A3 extends A2 {
	void method3() {System.out.println("A3 method");}
}

public class Ex01{
	public static void main(String[] args) {
		A2 a2=new A2();
		A3 a3=new A3();
		A1 a1=new A1();
		
		System.out.println("a1="+a2.a1);
		System.out.println("a2="+a2.a2);
		
		a3.method1();
		a3.method2();
		a3.method3();
			
	}
}