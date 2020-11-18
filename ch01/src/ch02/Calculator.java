package ch02;
//클래스의 전체 경로명: ch02.Calculator;

/* 주석: java 프로그램은 클래스 내에 있는 메소드(method)의 명령어들로 실행됨.  */
public class Calculator {
	
	//main method - 프로그램의 시작점(출발점)
	public static void main(String[] args) {
		//정수 타입의 변수 선언과 동시에 값(30)을 저장 
		int result = 10+20;  //오른쪽(실제 값)에서 왼쪽(저장 공간)으로 값을 저장. 
		/*
		 *int result;   //정수 타입의 변수 선언
		 *result=10+20;  //정수 타입 변수에 10+20 (30) 의 값을 저장.
		 */
		//정수 타입 변수 result가 가리키는 저장공간의 값을 출력
		System.out.println("결과: "+result);  
		System.out.println(Calculator.class.getName());
		
		//사용자 정의 라이브러리 사용, 같은 페키지 내에 있기 때문에 import 필요 없음. 
		MySystem.mysystem.out.println("my 결과: "+result);
		
	}//The end of main method

}
