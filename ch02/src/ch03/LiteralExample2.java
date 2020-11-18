package ch03;

//실수 리터럴
//실수 타입의 리터럴은 java에서는 double 타입을 디폴트 타입으로 간주함. 
//-실수 숫자 뒤에 f나 d가 없으면 무조건 double 타입으로 간주. 
public class LiteralExample2 {

	public static void main(String[] args) {
		//실수 리터럴 => 고정 소수점 방식, 부동 소수점 방식
		double a=0.1234;   //고정 소수점 방식
		double b=1234E-4;   //부동 소수점 방식 1234*10^(-4)
		
		//단정도 실수(32bit)는 float
		float c=0.1234f;  //숫자 뒤에 f를 붙임, f 안붙이면 double로 간주하기 때문에 에러 남. 
		
		//배정도 실수(64bit)는 double
		double d=.1234d;  //숫자 뒤에 d를 붙임  
		
		/* 변수 선언 타입과 초기값의 타입이 다른 경우 
		 * double e=1234E-4F;   // 이 경우는 가능. 선언 된 변수 타입의 크기가 실제 데이터의 크기보다 큼. 
		 * float f=0.1234D;     //이 경우는 불가능. 선언 된 변수 타입의 크기가 실제 데이터의 크기보다 작기 때문. 
		 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
