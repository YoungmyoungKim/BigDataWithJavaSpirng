package ch09.ch02;

public abstract class A {   
	void method() {System.out.println("abstract class A");}
	//����θ� ����� �޼ҵ� - �߻� �޼ҵ�, �߻� �޼ҵ�� �߻� Ŭ���� ������ ���� ����
	//�߻� Ŭ���� ������ �߻� �޼ҵ�, �Ϲ� �޼ҵ� ��� ���� ����. 
	abstract void absMethod();
}

class B extends A{
	//�θ� Ŭ������ �߻� �޼ҵ�� �ڽ� Ŭ�������� �ݵ�� ������ �ؾ��Ѵ�. 
	@Override
	void absMethod() {
		System.out.println("Overriding abstract method: class B");
	}
	
}

//�߻� Ŭ������ ��ӹ��� �߻� Ŭ���������� �߻� �޼ҵ� ������ ���ص� ��. 
abstract class C extends A{}

//�߻�Ŭ������ ��ӹ��� �߻� Ŭ������ ��ü Ŭ���������� �߻� �޼ҵ�� ������ �ؾ� ��.
class D extends C{
@Override
void absMethod() {
	System.out.println("Overriding abstract method: class D");}
}
