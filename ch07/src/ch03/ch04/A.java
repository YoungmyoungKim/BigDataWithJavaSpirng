package ch03.ch04;

public class A {
	int x;
	int y;
	int z;
	public A() {
		System.out.println("A의 기본 생성자 ");}
	
	public A(int x) {
		this.x=x;
		System.out.println("매개변수 x 가 있는 A의 생성자 ");}
	
	public A(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("매개변수 x, y 가 있는 A의 생성자 ");}
	
	public A(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("매개변수 x, y, z 가 있는 A의 생성자 ");}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	
}

class B extends A{
	public B() {
		super(10, 20, 30);
		System.out.println("B의 기본 생성자 ");}
	public B(int x) {
		super(x, 20, 30);   //부모 클래스의 매개변수가 있는 생성자를 호출하려면 super(부모 클래스의 매개변수)로 매개변수 전달. 
		System.out.println("매개변수 x 가 있는 B의 생성자 ");}
	
	public B(int x, int y) {
		super(x, y, 30);   //부모 클래스의 매개변수가 있는 생성자를 호출하려면 super(부모 클래스의 매개변수)로 매개변수 전달. 
		System.out.println("매개변수 x, y 가 있는 B의 생성자 ");}
	
	public B(int x, int y, int z) {
		super(x, y, z);   //부모 클래스의 매개변수가 있는 생성자를 호출하려면 super(부모 클래스의 매개변수)로 매개변수 전달. 
		System.out.println("매개변수 x, y, z 가 있는 B의 생성자 ");}
}
