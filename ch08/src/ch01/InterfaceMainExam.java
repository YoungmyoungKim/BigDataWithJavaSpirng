package ch01;

public class InterfaceMainExam {

	public static void main(String[] args) {
		//MyInterface mi=new MyInterface();   new()로 실체 생성 불가.
		MyInterface mi=new MyClass();      //상속받은 클래스를 구현체로 만들어서 생성. 
		
		//인터페이스도 클래스처럼 실체클래스에서 재정의한 메소드의 내용이 실행됨.
		mi.method();

	}

}
