package ch01.ch04;

public class A {
	private int x;   //외부에서 접근 불가
	public A(int x) {
		this.x=x;
	}
	public A() {
		this.x=0;
	}
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(10);
		System.out.println(a1.getX());
		System.out.println(a2.getX());
		a1.setX(12);
		a2.setX(a2.getX()*10);
		System.out.println();
		System.out.println(a1.getX());
		System.out.println(a2.getX());
	}
}
