package ch05;

public class OverrideMethodExam1 {

	public static void main(String[] args) {
		B b=new B();
		b.method1();
		b.method2(10);
		b.method3(10, 20);
		
		System.out.println();
		C c=new C();
		c.method1();
		c.method1(5);
		c.method2(2);
		c.method3(5,  7);

	}

}
