package ch03.ch02;

public class AMainExam {

	public static void main(String[] args) {
		B b=new B(10, 3, 14);
		System.out.println(b.getX());
		System.out.println(b.getY());
		System.out.println(b.getZ());
	
		B b2=new B();
		System.out.println(b2.getX());
		System.out.println(b2.getY());
		System.out.println(b2.getZ());
	}
}
