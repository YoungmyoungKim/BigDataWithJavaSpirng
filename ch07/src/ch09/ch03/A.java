package ch09.ch03;

public abstract class A {   
	void method() {System.out.println("abstract class A");}   //��ü �޼ҵ�
	abstract void method2();    //�߻� �޼ҵ�
}

abstract class B extends A{ 
	//�߻� �޼ҵ� �߰�
	abstract void method3();
}
//�߻� Ŭ������ �����Ǿ� ����� �߻�޼ҵ�� ��ü Ŭ�������� ��� ������ �Ǿ�� ��. 
class C extends B{
	@Override
	void method2() {System.out.println("class C: method2");}
	
	@Override
	void method3() {System.out.println("class C: method3");}
}

