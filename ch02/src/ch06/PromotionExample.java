package ch06;

//범위가 좁은 타입 -> 넓은 타입으로 자동 타입 변환(묵시적) promotion
public class PromotionExample {

	public static void main(String[] args) {
		//byte->int
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		//char -> int
		char charValue='가';
		System.out.println('\uac00');
		intValue=charValue;   //unicode 의 값이 숫자로 바뀌어서 저장 됨. 
		System.out.println(intValue);
		
		//int -> long
		intValue=500;
		long longValue=intValue;
		System.out.println(longValue);
		
		//int -> double
		intValue=200;
		double doubleValue= intValue;
		System.out.println(doubleValue);

	}

}
