package ch03;

public class AutoBoxingAutoUnBoxingExample {

	public static void main(String[] args) {
		//Wrapper 타입에 기본 타입을 바로 대입
		//AutoBoxing: 기본타입을 Wrapper 타입으로 바로 변환. 
		//기본타입을 객체 타입에 대입 
		Integer iValue=10;   //객체화
		Byte b=10;
		Short s=10;
		Long l=10l;
		Float f=10.0f;
		Double d=10.0;
		Boolean bool=true;
		
		//Wrapper 타입을 기본타입으로 바로 변환
		//AutoUnboxing
		int i=iValue;  
		byte b1=b;
		short s1=s;
		long l1=l;
		float f1=f;
		double d1=d;
		boolean bool1=bool;
		

	}

}
