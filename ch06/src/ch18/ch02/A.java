package ch18.ch02;

public class A {

	public static void main(String[] args) {
		A a= new A();
		//Ŭ������=���+Ŭ������
		System.out.println(a.getClass().getName());
		
		System.out.println(a.getClass().getCanonicalName());
		//��Ű����
		System.out.println(a.getClass().getPackage().getName());
		//��Ű���� ������ Ŭ������
		System.out.println(a.getClass().getSimpleName());
	}

}
