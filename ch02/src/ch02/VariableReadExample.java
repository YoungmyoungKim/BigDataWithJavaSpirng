package ch02;

public class VariableReadExample {

	public static void main(String[] args) {
		//정수 타입 변수 선언
		int value;
		//변수 선언 후 초기화하지 않으면 읽을 때(연산 혹은 출력시) 오류 발생
		value=30;
		
		int result= value + 10;
		System.out.println(result);
	}

}
