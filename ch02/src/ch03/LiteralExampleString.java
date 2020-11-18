package ch03;

import ch01.A;

//string 리터럴
public class LiteralExampleString {

	public static void main(String[] args) {
		//변수 선언과 초기화 
		String str="Good";
		
		//참조 타입 값 설정하는 new 생성자() 호출방식으로 값 대입 
		String str2=new String("Good");
		
		System.out.println(str);
		System.out.println(str2);
		
		//사용자 정의 클래스 A를 선언하고 초기화 
		A a=new A();
		/*
		 * 참조 타입의 경우 new 생성자를 이용하여 초기화 해야함 
		 * 아래 방법은 불가능 
		A a=10;
		A a="10"
		*/
	}

}
