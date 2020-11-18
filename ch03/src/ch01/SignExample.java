package ch01;

public class SignExample {

	public static void main(String[] args) {
		//부호연산 +, - 부호
		//리터럴로 -100 입력 가능 
		byte x= -100;
		System.out.println(x);
		
		
		//byte result1=-x;      //Error
		//System.out.println(result1);
		
		//변수 연산시 결과는 int 타입으로 변환
		int result1=-x;     //-(-100) -> 100
 		System.out.println(result1);
		
 		//byte result2=+x;
 		int result2=+x;
 		System.out.println(result2);
 		
 		byte byteValue=10;
 		char charValue='A';
 		

 		
	}

}
