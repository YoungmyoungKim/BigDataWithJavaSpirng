package ch01;

public class OutterMain {

	public static void main(String[] args) {
		A a=new A();
		//A��ü ���� �� BŬ������ ���� ����
		A.B b=a.new B();
		
		b.field1=3;
		b.method1();
	}

}
