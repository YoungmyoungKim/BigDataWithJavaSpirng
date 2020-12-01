package ch06.ch01;

public class AMainExam {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		b.method();
		
		System.out.println();
		a=b;    //b의 번지를 a가 공유함. 즉 같은 객체를 가리킴.
		a.method();
		
		a=new B();
		a.method();
		
		//상속 후 한 번 재정의 된 메소드는 
		//부모타입으로 형변환을 하더라도 자식타임의 재정의 내용으로 실행		
		A a2=new C();    //부모 타입으로 강제 캐스팅 
		a2.method();
	}
}
