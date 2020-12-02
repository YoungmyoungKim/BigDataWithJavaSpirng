package ch02;

public class C implements InterC {

	@Override
	public void method2() {
		System.out.println("real method2");
	}

	@Override
	public void method1() {
		System.out.println("real method1");
	}

	@Override
	public void method3() {
		System.out.println("real method3");
	}
	public static void main(String[] args) {
		InterA a=new C();
		a.method1();
		//a.method2();
		//a.method3();
		
		InterB b=new C();
		b.method1();
		b.method2();
		
		InterC c=new C();
		c.method1();
		c.method2();
		c.method3();
	}

}
