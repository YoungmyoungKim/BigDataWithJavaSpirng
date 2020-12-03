package ch01;

public class OutterMain {

	public static void main(String[] args) {
		A a=new A();
		//A객체 생성 후 B클래스에 접근 가능
		A.B b=a.new B();
		
		b.field1=3;
		b.method1();
	}

}
