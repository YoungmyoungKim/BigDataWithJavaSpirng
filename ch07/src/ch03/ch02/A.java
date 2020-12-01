package ch03.ch02;

public class A {
	int x;
	int y;
	public A() {
		this.x=0;
		this.y=0;
		System.out.println("A의 기본 생성자 ");}
	public A(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("매개변수 x 가 있는 A의 생성자 ");}
	public int getX() {return x;}
	public int getY() {return y;}
	
}

class B extends A{
	int z;
	public B() {
		this.z=0;
		System.out.println("B의 기본 생성자 ");}
	public B(int x, int y, int z) {
		super(x, y);   //부모 클래스의 매개변수가 있는 생성자를 호출하려면 super(부모 클래스의 매개변수)로 매개변수 전달. 
		this.z=z;
		System.out.println("매개변수 가 있는 B의 생성자 ");}
	public int getZ() {return z;}
}
