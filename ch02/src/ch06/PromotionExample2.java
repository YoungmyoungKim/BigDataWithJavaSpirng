package ch06;

public class PromotionExample2 {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		
		//정수 타입이 실수로 바껴서 저장 
		double result=x+y;
		
		System.out.println(result);
		
		//실수(double) - 정수(int) : 10.0(double) - 5.0(double)로 바꿔서 연산 
		result=10.0 - x;   		
		System.out.println(result);
		
	}

}
