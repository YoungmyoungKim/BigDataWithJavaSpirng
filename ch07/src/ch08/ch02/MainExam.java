package ch08.ch02;

public class MainExam {

	public static void main(String[] args) {
		//���� ������ ��ü���� �������� �ǵ��� �� ���� ����
		A a=new B();
		B b=(B)a;
		//�ڽ� ��ü���� ��ȯ �Ұ�
		//D d=(D)b;
		
		C c=new C();
		a=c;
		C c2=(C)a;
		
		//E e=(E) a;
		
		//�������� D�̹Ƿ� A���� ��ȯ�ߴٰ� �ٽ� D���� ��ȯ ����. 
		a=new D();
		b=(B)a;
		D d=(D) b;
		
	}

}
