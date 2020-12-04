package ch03;

public class WrapperClassExample {

	public static void main(String[] args) {
		//Wrapprt 클래스 생성: 기본 타입을 클래스화 시킨 것. 
		Integer iValue=new Integer(10);
		Integer iValue2=new Integer("10");
		
		//정수 타입을 문자열로 변환 toString();
		String value=iValue.toString();
		System.out.println(value);
		
		//문자열 값 정수로 변환 valueOf(문자열 값);
		iValue=Integer.valueOf("200");
		
		System.out.println(iValue);
		System.out.println(iValue.intValue());
		
		//Wrapper 클래스 정수값을 기본타입 int로 변환 intValue();
		int i=iValue.intValue();
		
		//기본타입 int 값을 Wrapper 클래스로 (객체 타입으로)변환 new Integer(정수값);
		iValue=new Integer(i);
		System.out.println(iValue2);

	}

}
