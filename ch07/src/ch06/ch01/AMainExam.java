package ch06.ch01;

public class AMainExam {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		b.method();
		
		System.out.println();
		a=b;    //b�� ������ a�� ������. �� ���� ��ü�� ����Ŵ.
		a.method();
		
		a=new B();
		a.method();
		
		//��� �� �� �� ������ �� �޼ҵ�� 
		//�θ�Ÿ������ ����ȯ�� �ϴ��� �ڽ�Ÿ���� ������ �������� ����		
		A a2=new C();    //�θ� Ÿ������ ���� ĳ���� 
		a2.method();
	}
}
