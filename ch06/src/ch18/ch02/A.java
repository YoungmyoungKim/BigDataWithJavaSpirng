package ch18.ch02;

public class A {

	public static void main(String[] args) {
		A a= new A();
		//클래스명=경로+클래스명
		System.out.println(a.getClass().getName());
		
		System.out.println(a.getClass().getCanonicalName());
		//패키지명
		System.out.println(a.getClass().getPackage().getName());
		//패키지를 제외한 클래스명
		System.out.println(a.getClass().getSimpleName());
	}

}
