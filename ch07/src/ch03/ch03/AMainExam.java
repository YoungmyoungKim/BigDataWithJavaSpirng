package ch03.ch03;

public class AMainExam {

	public static void main(String[] args) {
		B b=new B(10, 3);
		System.out.println(b.getX());
		System.out.println(b.getY());
		
		B b2=new B();
		System.out.println(b2.getX());
		System.out.println(b2.getY());
			}
}
