package ch03.ch02;

public class A {
	int x;
	int y;
	public A() {
		this.x=0;
		this.y=0;
		System.out.println("A�� �⺻ ������ ");}
	public A(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("�Ű����� x �� �ִ� A�� ������ ");}
	public int getX() {return x;}
	public int getY() {return y;}
	
}

class B extends A{
	int z;
	public B() {
		this.z=0;
		System.out.println("B�� �⺻ ������ ");}
	public B(int x, int y, int z) {
		super(x, y);   //�θ� Ŭ������ �Ű������� �ִ� �����ڸ� ȣ���Ϸ��� super(�θ� Ŭ������ �Ű�����)�� �Ű����� ����. 
		this.z=z;
		System.out.println("�Ű����� �� �ִ� B�� ������ ");}
	public int getZ() {return z;}
}
