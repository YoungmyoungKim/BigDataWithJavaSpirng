package ch03;

//boolean 타입의 리터럴은 true/false 두 개 뿐임.
public class LiteralExampleBoolean {

	public static void main(String[] args) {
		//boolean 타입의 변수 선언 후 true 저장	
		boolean a= true;
		
		//boolean 타입의 변수 선언 후 초기값으로 연산의 결과 값 true 저장
		boolean b= 10>0;
		
		//boolean 타입의 변수에는 int 타입의 값 저장 불가 
		//boolean c=1;
		
		//a가 true라서 블록 실행 
		if(a) {
			System.out.println("Hello! a가 true 입니다.");
		}
		
		//반복문 
		int i=1;
		while(a) {
			System.out.println("Hi");
			if(i==10) a=false;
			i=i+1;
			
		}
		
	}

}
