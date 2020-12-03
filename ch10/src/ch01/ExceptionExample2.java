package ch01;

public class ExceptionExample2 {

	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		try {
			result=x/y;	
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		//catch가 실행되면 그 아래 코드까지 실행 됨.
		System.out.println("계산이 불가합니다.");
}

}
