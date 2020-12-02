package ch08.ch03;

public class AMainExam {

	public static void main(String[] args) {
		//상속받은 자식클래스에서 부모 메소드를 재정의하면 재정의 된 내용으로 실행
		//메소드 실행시에 재정의된 메소들 실행이 결정됨.(동적 바인딩)
		A a=new B();    //promotion
		a.method1();
		//a.method2();   => 자식클래스에서 추가된 메소드라 실행 X
		
		B b=(B)a;     //casting
		a.method1();

	}

}
