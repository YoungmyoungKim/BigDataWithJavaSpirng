package ch01.ch05;

public class A {
	private int x;   //�ܺο��� ���� �Ұ�
	public int getX() {
		return x;
	}
}

class B extends A{
	void method() {
		System.out.println(getX());
	}
}