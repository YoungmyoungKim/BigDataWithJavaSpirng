package ch09.ch02;

public class MainExam {

	public static void main(String[] args) {
		B b=new B();   
		b.method();
		b.absMethod();
		
		//C c=new C();    //�߻� Ŭ������ ��ü(��ü)�� ������ ����. 
		D d=new D();
		
		d.absMethod();
		d.method();
	}
}
