package ch03;

public class A {
	
	void method() {//�ν��Ͻ� ���
		class D{//�ν��Ͻ� ��� ���� �ν��Ͻ� Ŭ����
			D(){}
			int field1;  //�ν��Ͻ� �ʵ�
			void method() {System.out.println("D");}
		}//class D ��
		D d=new D();
		d.field1=3;
		d.method();
	}//method ���� ��
}
