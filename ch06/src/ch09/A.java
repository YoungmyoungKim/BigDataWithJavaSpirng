package ch09;

//�ʵ�, ������, �޼ҵ尡 ���� �ҽ��ڵ� => ������ �� class ���Ͽ��� �⺻ ������ A(){} �� ���� ��.
public class A {}

//�ʵ常 �ִ� �ҽ��ڵ� => ������ �� class ���Ͽ� int field1�� B(){} ���� ��.
class B{
	//�ʵ�
	int field1;
}

//�ʵ�� �޼ҵ常 �ִ� �ҽ��ڵ� => ������ �� class ���Ͽ� field�� C(){}�� method1(){} ���� ��. 
class C{
	int field1;
	void method1() {}
}

//�ʵ�� �޼ҵ�� ������ ��� �ִ� �ҽ��ڵ� => ������ �� class ���Ͽ� field, d(){}, method(){} ���� ��
class D{
	int field;   //��� �ʵ�
	D(){}    //������
	void method() {}    //��� �޼ҵ�
}