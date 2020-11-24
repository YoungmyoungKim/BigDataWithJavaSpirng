package ch01;

public class ClassJVMExample {
	//런타임 상수 ="hello"
	//필드 msg1, msg2
	String msg1="hello";
	String msg2="hello";
	
	//필드 age
	int age=10;
	
	public void method() {
		double d=10.2;    //메소드 데이터: 메소드 내에서 쓸 수 있는 지역 변수 
		System.out.println("hi");
		
	}
	//기본 생성자 코드
	ClassJVMExample(){
		System.out.println("기본 생성자 실행");
	}
	//main 메소드는 ClassJVMExample 객체 생성을 위한 별도의 실행 코드 
	public static void main(String[] args) {
		new ClassJVMExample();
	}
}
