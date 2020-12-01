package ch03.ch04;

public class AMainExam {

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.getX());
		System.out.println(b1.getY());
		System.out.println(b1.getZ());
		
		B b2=new B(5);
		System.out.println(b2.getX());
		System.out.println(b2.getY());
		System.out.println(b2.getZ());
		
		B b3=new B(5, 15);
		System.out.println(b3.getX());
		System.out.println(b3.getY());
		System.out.println(b3.getZ());
		
		B b4=new B(5, 15, 25);
		System.out.println(b4.getX());
		System.out.println(b4.getY());
		System.out.println(b4.getZ());
			}
}
