package ch03.ch04;

public class A {
	int x;
	int y;
	int z;
	public A() {
		System.out.println("A�� �⺻ ������ ");}
	
	public A(int x) {
		this.x=x;
		System.out.println("�Ű����� x �� �ִ� A�� ������ ");}
	
	public A(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("�Ű����� x, y �� �ִ� A�� ������ ");}
	
	public A(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("�Ű����� x, y, z �� �ִ� A�� ������ ");}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	
}

class B extends A{
	public B() {
		super(10, 20, 30);
		System.out.println("B�� �⺻ ������ ");}
	public B(int x) {
		super(x, 20, 30);   //�θ� Ŭ������ �Ű������� �ִ� �����ڸ� ȣ���Ϸ��� super(�θ� Ŭ������ �Ű�����)�� �Ű����� ����. 
		System.out.println("�Ű����� x �� �ִ� B�� ������ ");}
	
	public B(int x, int y) {
		super(x, y, 30);   //�θ� Ŭ������ �Ű������� �ִ� �����ڸ� ȣ���Ϸ��� super(�θ� Ŭ������ �Ű�����)�� �Ű����� ����. 
		System.out.println("�Ű����� x, y �� �ִ� B�� ������ ");}
	
	public B(int x, int y, int z) {
		super(x, y, z);   //�θ� Ŭ������ �Ű������� �ִ� �����ڸ� ȣ���Ϸ��� super(�θ� Ŭ������ �Ű�����)�� �Ű����� ����. 
		System.out.println("�Ű����� x, y, z �� �ִ� B�� ������ ");}
}
