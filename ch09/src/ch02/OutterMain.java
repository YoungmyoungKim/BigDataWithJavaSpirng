package ch02;

public class OutterMain {
	public static void main(String[] args) {
		//�ٱ�Ÿ��.����Ÿ�� ����=new �ٱ�Ŭ����.����Ŭ����()
		//A��ü ���� �� B ��ü�� �ٷ� ���� ���� 
		A.B b=new A.B();
		
		//�ν��Ͻ� �ʵ� & �޼ҵ�
		b.field1=3;
		b.method1();
		
		//static ���, Ŭ���� ������ ����
		A.B.field2=3;
		A.B.method2();
	}

}
