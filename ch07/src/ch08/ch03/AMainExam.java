package ch08.ch03;

public class AMainExam {

	public static void main(String[] args) {
		//��ӹ��� �ڽ�Ŭ�������� �θ� �޼ҵ带 �������ϸ� ������ �� �������� ����
		//�޼ҵ� ����ÿ� �����ǵ� �޼ҵ� ������ ������.(���� ���ε�)
		A a=new B();    //promotion
		a.method1();
		//a.method2();   => �ڽ�Ŭ�������� �߰��� �޼ҵ�� ���� X
		
		B b=(B)a;     //casting
		a.method1();

	}

}
